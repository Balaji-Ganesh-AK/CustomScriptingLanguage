using System;
using System.Collections.Generic;
using System.Diagnostics.Contracts;
using System.Linq;
using System.Text;
using System.Xml.Schema;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using Antlr4.Runtime.Tree.Pattern;

namespace MegaScrypt
{
    public class Processor : DNEScryptBaseVisitor<object>
    {
        private Object target;

        public Object Target
        {
            get => target;
            set => target = value;
        }



        protected object GetValue([NotNull] ITerminalNode context)
        {
            string varName = context.GetText();
            object value = target.Get(varName);
            return value;
        }

        public override object VisitDeclaration([NotNull]DNEScryptParser.DeclarationContext context)
        {
            string varName = context.Id().Accept(this) as string;

            object value = null;

            
            if (context.expression() != null)
            {
                value = context.expression().Accept(this);
            }

            if (value == "null")
            {
                value = null;
            }

            target.Declare(varName,value);
            return value;

        }

        public override object VisitBlock([NotNull]DNEScryptParser.BlockContext context)
        {
            Object prevTraget = target;
            target = new Object(prevTraget);
            object ret = base.VisitBlock(context);

            target = prevTraget;

            return ret;
        }


        public override object VisitBincrement(DNEScryptParser.BincrementContext context)
        {
            string varName = context.Id().Accept(this) as string;
            ITerminalNode operatorNode = context.children[0] as ITerminalNode;
            object value = 0;
            if (operatorNode != null && operatorNode.Symbol.Type == DNEScryptParser.Increment)
            {
                value = target.Get(varName);
                if (value is int)
                {

                    value = Convert.ToInt32(target.Get(varName)) + 1;

                }

                if (value is float)
                {
                    value = Convert.ToSingle(target.Get(varName)) + 1;
                }
            }
            if (operatorNode.Symbol.Type == DNEScryptParser.Decrement)
            {
                value = target.Get(varName);
                if (value is int)
                {

                    value = Convert.ToInt32(target.Get(varName)) - 1;

                }

                if (value is float)
                {
                    value = Convert.ToSingle(target.Get(varName)) - 1;
                }
            }
            target.Set(varName, value);
            return value;
        }



        public override object VisitIncrement(DNEScryptParser.IncrementContext context)
        {
            string varName = context.Id().Accept(this) as string;
            ITerminalNode operatorNode = context.children[1] as ITerminalNode;
            object value = 0;
            if (operatorNode != null && operatorNode.Symbol.Type == DNEScryptParser.Increment)
            {
                value = target.Get(varName);
                if (value is int)
                {

                    value = Convert.ToInt32(target.Get(varName)) + 1;

                }

                if (value is float)
                {
                    value = Convert.ToSingle(target.Get(varName)) + 1;
                }
            }
            if (operatorNode != null && operatorNode.Symbol.Type == DNEScryptParser.Decrement)
            {
                value = target.Get(varName);
                if (value is int)
                {

                    value = Convert.ToInt32(target.Get(varName)) - 1;

                }

                if (value is float)
                {
                    value = Convert.ToSingle(target.Get(varName)) - 1;
                }
            }
            target.Set(varName, value);
            return value;
        }

        public override object VisitAssignment([NotNull] DNEScryptParser.AssignmentContext context)
        {
            string varName = context.Id().Accept(this) as string;
            ITerminalNode operatorNode = context.children[1] as ITerminalNode;


            object value = 0;

               value = context.expression().Accept(this);
               object x = context.expression().Accept(this);
                switch (operatorNode.Symbol.Type)
                {
                    case DNEScryptParser.Equals: break;
                    case DNEScryptParser.DivideEquals:
                        if (value is int)

                        {

                            value = Convert.ToInt32(target.Get(varName)) / Convert.ToInt32(x);
                        }

                        if (value is float)
                        {
                            value = Convert.ToSingle(target.Get(varName)) / Convert.ToSingle(x);
                        }

                        break;
                    case DNEScryptParser.MultiplyEquals:
                        if (value is int)
                        {

                            value = Convert.ToInt32(target.Get(varName)) * Convert.ToInt32(x);
                        }

                        if (value is float)
                        {
                            value = Convert.ToSingle(target.Get(varName)) * Convert.ToSingle(x);
                        }

                        break;
                    case DNEScryptParser.AddEquals:
                        if (value is int)
                        {

                            value = Convert.ToInt32(target.Get(varName)) + Convert.ToInt32(x);
                        }

                        if (value is float)
                        {
                            value = Convert.ToSingle(target.Get(varName)) + Convert.ToSingle(x);
                        }

                        if (value is string)
                        {
                            value = target.Get(varName).ToString() + x.ToString();
                        }

                        break;
                    case DNEScryptParser.SubEquals:
                        if (value is int)
                        {

                            value = Convert.ToInt32(target.Get(varName)) - Convert.ToInt32(x);
                        }

                        if (value is float)
                        {
                            value = Convert.ToSingle(target.Get(varName)) - Convert.ToSingle(x);
                        }

                        break;
                    

                }
            

           target.Set(varName,value);
            return value;

        }

        public override object VisitIfStmt(DNEScryptParser.IfStmtContext context)
        {
            object result = context.expression().Accept(this);
            bool test = ToBool(result);
            if (test)
            {
                object ret = context.block().Accept(this);
                return ret;
            }
            else
            {

                object ret =context.elseStmt().block().Accept(this);
                return ret;
            }
           
            return null;
        }
        
        public override object VisitElseStmt(DNEScryptParser.ElseStmtContext context)
        {
            object ret = context.block().Accept(this);
            return ret;
        }

        public override object VisitElseifStmt(DNEScryptParser.ElseifStmtContext context)
        {
            object result = context.expression().Accept(this);
            bool test = ToBool(result);
            if (test)
            {
                object ret = context.block().Accept(this);
                return ret;
            }

            return null;
        }

        public override object VisitTerminal(ITerminalNode node)
        {
            switch (node.Symbol.Type)
            {
                case DNEScryptParser.True: return true;
                case DNEScryptParser.False: return false;
                case DNEScryptParser.Id: return node.GetText();
                case DNEScryptParser.Number:
                {
                    string s = node.GetText();
                        if (s.Contains('.'))
                        {
                            float f = float.Parse(s);
                            return f;
                        }
                        else
                        {
                            int i = int.Parse(s);
                            return i;
                        }
                }
                case DNEScryptParser.String:
                {
                    string s =node.GetText();
                    if (s.Contains('"'))
                    {
                       s= s.Remove(0, 1);
                       s = s.Remove(s.Length-1,1);

                    }

                    return s;
                }
            }
            return base.VisitTerminal(node);
        }

        public override object VisitExpression([NotNull] DNEScryptParser.ExpressionContext context)
        {
            if (context.children.Count == 1)
            {
                if (context.Id() != null )
                {
                    Console.WriteLine("hu"+ context.Id());
                    return GetValue(context.Id());
                }

                object result = context.children[0].Accept(this);
                return result;

            }

            DNEScryptParser.ExpressionContext[] exprs = context.expression();
            if (exprs.Length == 0)
            {
                ITerminalNode operatorNode = context.children[1] as ITerminalNode;
                return 0;

            }

            if (exprs.Length == 1)
            {
                object result = exprs[0].Accept(this);
                if (context.Minus() != null)
                {
                    if (result is int)
                        result = -(int)result;
                    else
                    {
                        result = -(float)result;
                    }
                }
                else if (context.Not()!=null)
                {
                    return !ToBool(result);
                    
                }

                return result;
            }


            if (exprs.Length == 2)
            {
                object a = exprs[0].Accept(this);
                object b = exprs[1].Accept(this);
                ITerminalNode operatorNode = context.children[1] as ITerminalNode;

                return BinaryOperationHandler(a, b, operatorNode);
            }
            Console.WriteLine(exprs.Length);
            throw new NotImplementedException();
        }

        protected object BinaryOperationHandler(object objectA, object objectB, ITerminalNode node)
        {
            if (objectA is int && objectB is int)
                return BinaryIntOp(objectA, objectB, node);
            else if (objectA is bool && objectB is bool)
                return BinaryBoolOp(objectA, objectB, node);
            else if (objectA is string && objectB is string)
                return BinaryStringOp(objectA, objectB, node);
            else
            {
                return BinaryFloatOp(objectA, objectB, node);
            }
            throw new InvalidOperationException();
        }

        private object BinaryStringOp(object objectA, object objectB, ITerminalNode node)
        {
            string a = objectA.ToString();
            string b = objectB.ToString();

            switch (node.Symbol.Type)
            {
                case DNEScryptParser.Add: return a + b;
               
            }
            throw new NotImplementedException();
        }

        private bool ToBool(object a)
        {
            if (a is bool)
                return (bool) a;
            throw new InvalidOperationException($"Unable to cast\"{a}\"as a bool");
        }

        private object BinaryBoolOp(object objectA, object objectB, ITerminalNode node)
        {
            bool a = ToBool(objectA);
            bool b = ToBool(objectB);

            switch (node.Symbol.Type)
            {
                case DNEScryptParser.And: return a && b;
                case DNEScryptParser.DoubleEquals: return a == b;
                case DNEScryptParser.NotEquals: return a != b;
                case DNEScryptParser.Or: return a || b;
            }

            throw new NotImplementedException();
        }


        protected object BinaryIntOp(object objectA, object objectB, ITerminalNode node)
        {

            int a = Convert.ToInt32(objectA);
            int b = Convert.ToInt32(objectB);

            switch (node.Symbol.Type)
            {
                case DNEScryptParser.Add: return a + b;
                case DNEScryptParser.Minus: return a - b;
                case DNEScryptParser.Multiply: return a * b;
                case DNEScryptParser.Divide: return a / b;
                case DNEScryptParser.DoubleEquals: return a == b;
                case DNEScryptParser.NotEquals: return a != b;
                case DNEScryptParser.LessOrEqual: return a <= b;
                case DNEScryptParser.GreaterOrEqual: return a >= b;
                case DNEScryptParser.LessThan: return a < b;
                case DNEScryptParser.GreaterThan: return a > b;
                case DNEScryptParser.MultiplyEquals: return a *= b;
                case DNEScryptParser.DivideEquals: return a /= b;
                default:
                    throw new ArgumentOutOfRangeException(nameof(node));
            }
            throw new NotImplementedException();
        }


        protected object BinaryFloatOp(object objectA, object objectB, ITerminalNode node)
        {

            float a = Convert.ToSingle(objectA);
            float b = Convert.ToSingle(objectB);

            switch (node.Symbol.Type)
            {
                case DNEScryptParser.Add: return a + b;
                case DNEScryptParser.Minus: return a - b;
                case DNEScryptParser.Multiply: return a * b;
                case DNEScryptParser.Divide: return a / b;
                case DNEScryptParser.DoubleEquals: return Math.Abs(a - b) < 0.00000001;
                case DNEScryptParser.NotEquals: return Math.Abs(a - b) > 0.00000001;
                case DNEScryptParser.LessOrEqual: return a <= b;
                case DNEScryptParser.GreaterOrEqual: return a >= b;
                case DNEScryptParser.LessThan: return a < b;
                case DNEScryptParser.GreaterThan: return a > b;
                case DNEScryptParser.MultiplyEquals: return a *= b;
                case DNEScryptParser.DivideEquals: return a /= b;
                default:
                    throw new ArgumentOutOfRangeException(nameof(node));
            }
            throw new NotImplementedException();
        }
    }
}

