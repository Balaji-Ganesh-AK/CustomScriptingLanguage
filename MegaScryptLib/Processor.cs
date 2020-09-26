using System;
using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using MegaScryptLib;

namespace MegaScrypt
{
    public class Processor : MegaScryptBaseVisitor<object>
    {
        private Object target;

        public Object Target
        {
            get => target;
            set => target = value;
        }



        protected object GetValue([NotNull] ITerminalNode context, Object Itarget = null)
        {
            if (Itarget == null)
                Itarget = this.target;
            string varName = context.GetText();
            object value = target.Get(varName);
            return value;
        }

       
        protected void SetValue([NotNull] ITerminalNode context, object value, Object Itarget = null)
        {
            if (Itarget == null)
                Itarget = this.target;
            string varName = context.GetText();
            Itarget.Set(varName, value);
        }

        #region Declareation

        

        public override object VisitDeclaration([NotNull] MegaScryptParser.DeclarationContext context)
        {
            string varName = context.Id().Accept(this) as string;

            object value = null;


            if (context.expression() != null)
            {
                value = context.expression().Accept(this);
            }

            else if (context.@object() != null)
            {
                value = context.@object().Accept(this);
            }

            else if (context.array()!= null)
            {
                value = context.array().Accept(this);
               return value;
            }

            if (value == "null")
            {
                value = null;
            }

            target.Declare(varName, value);
            return value;

        }
        #endregion

        #region Block

        public override object VisitBlock([NotNull] MegaScryptParser.BlockContext context)
        {
            Object prevTraget = target;
            target = new Object(prevTraget);
           // object ret = base.VisitBlock(context);

            var statementsList = context.statement();
            object ret = null;

            foreach (MegaScryptParser.StatementContext statement in statementsList)
            {
                if (statement.Break() != null)
                {
                    returnState = ReturnStateEnum.Break;
                    IsReturnStateProcessed = false;
                    break;
                }
                else if (statement.Continue() != null)
                {
                    returnState = ReturnStateEnum.Cont;
                    IsReturnStateProcessed = false;
                    break;
                }
                else
                {
                    if (!IsReturnStateProcessed)
                    {
                        break;
                    }

                    returnState = ReturnStateEnum.None;
                    ret = statement.Accept(this);

                }
            }

            target = prevTraget;

            return ret;
        }
        #endregion

        #region ++ --

        
        public override object VisitBincrement(MegaScryptParser.BincrementContext context)
        {
            string varName = context.Id().Accept(this) as string;
            ITerminalNode operatorNode = context.children[0] as ITerminalNode;
            object value = 0;
            if (operatorNode != null && operatorNode.Symbol.Type == MegaScryptParser.Increment)
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
            if (operatorNode.Symbol.Type == MegaScryptParser.Decrement)
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



        public override object VisitIncrement(MegaScryptParser.IncrementContext context)
        {
            string varName = context.Id().Accept(this) as string;
            ITerminalNode operatorNode = context.children[1] as ITerminalNode;
            object value = 0;
            if (operatorNode != null && operatorNode.Symbol.Type == MegaScryptParser.Increment)
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
            if (operatorNode != null && operatorNode.Symbol.Type == MegaScryptParser.Decrement)
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

        #endregion

        #region Assignment

        


     
        public override object VisitAssignment([NotNull] MegaScryptParser.AssignmentContext context)
        {
            string varName = null;
            object current = target;
            MegaScryptParser.ObjectValidEntryContext[] objectsList = null;

            if (context.compoundId().objectGet() != null)
            {
                objectsList = context.compoundId().objectGet().objectValidEntry();
                varName = objectsList.Last().Id().Accept(this) as string;

                current = GetParentObject(objectsList);
            }
            else if (context.compoundId().Id() != null)
            {
                varName = context.compoundId().Id().Accept(this) as string;
            }
            object newValue = context.children[2].Accept(this);
            ITerminalNode operatorNode = context.children[1] as ITerminalNode;

            switch (operatorNode.Symbol.Type)
            {
                case MegaScryptParser.AddEquals:
                {
                    if (context.expression().String() != null)
                    {
                        string value = context.compoundId().Accept(this).ToString();
                        string targetString = value + newValue.ToString();
                        newValue = targetString;
                    }
                    else
                    {
                        object oldValue = context.compoundId().Accept(this);
                        newValue = AssigmentOperationHandler(oldValue, newValue, operatorNode);
                    }
                }
                    break;

                case MegaScryptParser.SubEquals:
                case MegaScryptParser.MultiplyEquals:
                case MegaScryptParser.DivideEquals:
                {
                    object oldValue = context.compoundId().Accept(this);
                    newValue = AssigmentOperationHandler(oldValue, newValue, operatorNode);
                }
                    break;
            }


            if (context.compoundId().Id() != null)
            {
                ((Object)current).Set(varName,newValue);
            }
            else
            {
                if (objectsList.Last().arrayIndex() == null)
                {
                    ((Object)current).Set(varName, newValue);
                }
                else
                {
                    Array array = (Array)((Object)current).Get(varName);
                    int index = Convert.ToInt32(objectsList.Last().arrayIndex().expression().Accept(this));
                    array[index] = newValue;
                }
              

            }
            return newValue;
        }

        private object AssigmentOperationHandler(object oldValue, object newValue, ITerminalNode type)
        {

            bool hasDot = newValue.ToString().Contains(".") || newValue is float;
            switch (type.Symbol.Type)
            {
                case MegaScryptParser.SubEquals:
                {
                    if (hasDot)
                    {

                        return BinaryOperationHandler(oldValue, newValue, type);
                    }
                    else
                    {
                        return BinaryOperationHandler(oldValue, newValue, type);
                    }
                }
                case MegaScryptParser.AddEquals:
                    {
                        if (hasDot)
                        {

                            return BinaryOperationHandler(oldValue, newValue, type);
                        }
                        else
                        {
                            return BinaryOperationHandler(oldValue, newValue, type);
                        }
                    }

                case MegaScryptParser.Minus:
                    {
                        if (hasDot)
                        {
                            return BinaryOperationHandler(oldValue, newValue, type);
                        }
                        else
                        {
                            return BinaryOperationHandler(oldValue, newValue, type);
                        }
                    }

                case MegaScryptParser.MultiplyEquals:
                    {
                        if (hasDot)
                        {
                            return BinaryOperationHandler(oldValue, newValue, type);
                        }
                        else
                        {
                            return BinaryOperationHandler(oldValue, newValue, type);
                        }
                    }

                case MegaScryptParser.DivideEquals:
                    {
                        if (hasDot)
                        {
                            return BinaryOperationHandler(oldValue, newValue, type);
                        }
                        else
                        {
                            return BinaryOperationHandler(oldValue, newValue, type);
                        }
                    }
            }

            throw new InvalidOperationException($"Invalid Operation:");
        }

        #endregion


        #region IfElseStatement

        public override object VisitIfStmt(MegaScryptParser.IfStmtContext context)
        {
            object result = context.expression().Accept(this);
            bool test = ToBool(result);
            if (test)
            {
                object ret = context.block().Accept(this);
                return ret;
            }

            var elseIfs = context.elseifStmt();
            foreach (var elseIf in elseIfs)
            {
                object elseIfResult = elseIf.Accept(this);
                if (elseIfResult != null)
                {
                    return elseIfResult;
                }

            }
            if (context.elseStmt() != null)
            {
                return context.elseStmt().Accept(this);
            }

            return null;
        }

        public override object VisitElseStmt(MegaScryptParser.ElseStmtContext context)
        {
            object ret = context.block().Accept(this);
            return ret;
        }

        public override object VisitElseifStmt([NotNull] MegaScryptParser.ElseifStmtContext context)
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

        #endregion

        #region VisitTerminal

        public override object VisitTerminal(ITerminalNode node)
        {
            switch (node.Symbol.Type)
            {
                case MegaScryptParser.True: return true;
                case MegaScryptParser.False: return false;
                case MegaScryptParser.Id: return node.GetText();
                case MegaScryptParser.Number:
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
                case MegaScryptParser.String:
                    {
                        string s = node.GetText();
                        if (s.Contains('"'))
                        {
                            s = s.Remove(0, 1);
                            s = s.Remove(s.Length - 1, 1);

                        }

                        return s;
                    }
                case MegaScryptParser.Null: return null;
            }
            return (node);
        }
        

        #endregion

        public override object VisitCompoundId(MegaScryptParser.CompoundIdContext context)
        {
            if (context.Id() != null)
            {
                return GetValue(context.Id());

            }
            else if (context.objectGet()!=null)
            {
                return context.objectGet().Accept(this);
            }

            return null;
        }

        //public override object VisitPrint(MegaScryptParser.PrintContext context)
        //{
        //    string stringToPrint;

        //    if (context.children.Count == 5)
        //    {
        //        stringToPrint = "";
        //    }
        //    else
        //    {

        //        stringToPrint = context.String().Accept(this) as string;

        //    }

        //    string varName = context.Id().Accept(this) as string;
        //    target.AddToPrintList(stringToPrint, varName);
        //    return base.VisitPrint(context);
        //}

        #region Array

        public override object VisitArray([NotNull]MegaScryptParser.ArrayContext context)
        {
            Array array = new Array();
            if (context.paramList() != null)
            {
                array = new Array(context.paramList().Accept(this)as List<object>);
            }

            return array;
        }

        public override object VisitArrayIndex([NotNull] MegaScryptParser.ArrayIndexContext context) =>
            context.expression().Accept(this);
       
        #endregion

        public override object VisitExpression([NotNull] MegaScryptParser.ExpressionContext context)
        {
            if (context.children.Count == 1)
            {
                if (context.Id() != null)
                {
                    return GetValue(context.Id());
                }

                object result = context.children[0].Accept(this);
                return result;

            }
            else if (context.LeftParenthesis()!=null && context.RightParenthesis()!=null && context.children.Count ==3)
            {
                return context.children[1].Accept(this);
            }

            MegaScryptParser.ExpressionContext[] exprs = context.expression();
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
                else if (context.Not() != null)
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

        #region BinaryOperations

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
                case MegaScryptParser.Add: return a + b;

            }
            throw new NotImplementedException();
        }

        private bool ToBool(object a)
        {
            if (a is bool)
                return (bool)a;
            throw new InvalidOperationException($"Unable to cast\"{a}\"as a bool");
        }

        private object BinaryBoolOp(object objectA, object objectB, ITerminalNode node)
        {
            bool a = ToBool(objectA);
            bool b = ToBool(objectB);

            switch (node.Symbol.Type)
            {
                case MegaScryptParser.And: return a && b;
                case MegaScryptParser.DoubleEquals: return a == b;
                case MegaScryptParser.NotEquals: return a != b;
                case MegaScryptParser.Or: return a || b;
                
            }

            throw new NotImplementedException();
        }


        protected object BinaryIntOp(object objectA, object objectB, ITerminalNode node)
        {

            int a = Convert.ToInt32(objectA);
            int b = Convert.ToInt32(objectB);

            switch (node.Symbol.Type)
            {
                case MegaScryptParser.Add: return a + b;
                case MegaScryptParser.Minus: return a - b;
                case MegaScryptParser.Multiply: return a * b;
                case MegaScryptParser.Divide: return a / b;
                case MegaScryptParser.DoubleEquals: return a == b;
                case MegaScryptParser.NotEquals: return a != b;
                case MegaScryptParser.LessOrEqual: return a <= b;
                case MegaScryptParser.GreaterOrEqual: return a >= b;
                case MegaScryptParser.LessThan: return a < b;
                case MegaScryptParser.GreaterThan: return a > b;
                case MegaScryptParser.MultiplyEquals: return a *= b;
                case MegaScryptParser.DivideEquals: return a /= b;
                case MegaScryptParser.AddEquals: return a += b;
                case MegaScryptParser.SubEquals: return a -= b;
                case MegaScryptParser.Modulus: return a % b;
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
                case MegaScryptParser.Add: return a + b;
                case MegaScryptParser.Minus: return a - b;
                case MegaScryptParser.Multiply: return a * b;
                case MegaScryptParser.Divide: return a / b;
                case MegaScryptParser.DoubleEquals: return Math.Abs(a - b) < 0.00000001;
                case MegaScryptParser.NotEquals: return Math.Abs(a - b) > 0.00000001;
                case MegaScryptParser.LessOrEqual: return a <= b;
                case MegaScryptParser.GreaterOrEqual: return a >= b;
                case MegaScryptParser.LessThan: return a < b;
                case MegaScryptParser.GreaterThan: return a > b;
                case MegaScryptParser.MultiplyEquals: return a *= b;
                case MegaScryptParser.DivideEquals: return a /= b;
                case MegaScryptParser.AddEquals: return a += b;
                case MegaScryptParser.SubEquals: return a -= b;
                case MegaScryptParser.Modulus: return a % b;
                default:
                    throw new ArgumentOutOfRangeException(nameof(node));
            }
            throw new NotImplementedException();
        }


        #endregion

        #region Objects

        private object GetParentObject(MegaScryptParser.ObjectValidEntryContext[] objectslist)
        {
            object currentParent = target;
            for (int i = 0; i < objectslist.Length - 1; i++)
            {
                var singleObject = objectslist[i];
                if (singleObject.arrayIndex() == null)
                {
                    object value = ((Object)currentParent).Get(singleObject.Accept(this) as string);
                    currentParent = value;
                }
                else
                {
                    int indexValue = Convert.ToInt32(singleObject.arrayIndex().expression().Accept(this));
                    object value = ((Object)currentParent).Get(singleObject.Id().Accept(this) as string);

                    Array array = (Array)value;
                    currentParent = array[indexValue];
                }
            }

            return currentParent;
        }

        public override object VisitObject([NotNull]MegaScryptParser.ObjectContext context)
        {
            var objectPairs = context.objectPair();
            Object currentObject = new Object(target);

            foreach (var VARIABLE in objectPairs)
            {
                object objectValue = VARIABLE.Accept(this);
                string ID = VARIABLE.Id().Accept(this) as string;
                currentObject.Declare(ID,objectValue);
            }

            return currentObject;
        }

        public override object VisitObjectPair([NotNull]MegaScryptParser.ObjectPairContext context)
        {
            if (context.expression() != null)
            {
                return context.expression().Accept(this);
            }
            else if (context.@object() != null)
            {
                return context.@object().Accept(this);
            }
            throw new InvalidOperationException("Invalid Opertaion");
        }

        public override object VisitObjectGet([NotNull]MegaScryptParser.ObjectGetContext context)
        {
            var ValidEntry = context.objectValidEntry();
            object current = target;
            
            foreach (var id in ValidEntry)
            {
              
                if (id.arrayIndex() == null)
                {
                    object value = ((Object) current).Get(id.Accept(this) as string);
                    current = value;
                }
                else
                {
                    int indexValue = Convert.ToInt32(id.arrayIndex().expression().Accept(this));
                    object value = ((Object) current).Get(id.Id().Accept(this) as string);

                    Array array = (Array) value;
                    current = array[indexValue];
                }
            }

            return current;
        }

        #endregion


        #region ForLoop

        public override object VisitForLoop(MegaScryptParser.ForLoopContext context)
        {
            Object prevTarget = target;
            target = new Object(prevTarget);

            ITerminalNode[] ids = context.Id();
            var expers = context.expression();
            string varName = ids[0].Accept(this) as string;

            target.Declare(varName, expers[0].Accept(this));



            while (true)
            {
                bool canExitWhileLoop = false;
                string secondVarName = ids[1].Accept(this) as string;

                float expressionValue = Convert.ToSingle(expers[1].Accept(this));
                float secondVarValue = Convert.ToSingle(target.Get(secondVarName));

                ITerminalNode symbol = context.children[8] as ITerminalNode;

                switch (symbol.Symbol.Type)
                {
                    case MegaScryptParser.GreaterOrEqual:
                        if (secondVarValue > expressionValue)
                        {
                            canExitWhileLoop = true;
                        }

                        break;
                    case MegaScryptParser.LessOrEqual:
                        if (secondVarValue < expressionValue)
                        {
                            canExitWhileLoop = true;
                        }

                        break;
                    case MegaScryptParser.LessThan:
                        if (secondVarValue >= expressionValue)
                        {
                            canExitWhileLoop = true;
                        }

                        break;
                    case MegaScryptParser.GreaterThan:
                        if (secondVarValue >= expressionValue)
                        {
                            canExitWhileLoop = true;
                        }

                        break;
                }


                //Case break
                if (canExitWhileLoop || returnState == ReturnStateEnum.Break)
                {
                    IsReturnStateProcessed = true;
                    break;
                }

                //case Continue
                 if (canExitWhileLoop || returnState == ReturnStateEnum.Break)
                 {
                     IsReturnStateProcessed = true;
                 }

                 context.block().Accept(this);
                 //Handle increments
                 if (context.increment() != null)
                 {
                     context.increment().Accept(this);
                 }

                if (context.bincrement() != null)
                {
                    context.bincrement().Accept(this);
                }
            }

            //reset the target
            target = prevTarget;
            return null;

        }

        private enum ReturnStateEnum
        {
            Break,
            Cont,
            None
        }

        private ReturnStateEnum returnState = ReturnStateEnum.None;
        private bool IsReturnStateProcessed = true;

        #endregion

        #region ForEach

        public override object VisitForEachLoop(MegaScryptParser.ForEachLoopContext context)
        {
            Array array = (Array) context.compoundId().Accept(this);

            Object prevTarget = target;
            target = new Object(prevTarget);

            string varName = context.Id().Accept(this) as string;
            target.Declare(varName,array[0]);


            foreach (var VARIABLE in array)
            {
                if(returnState == ReturnStateEnum.Break)
                {
                    IsReturnStateProcessed = true;
                    break;
                }
                else if (returnState==ReturnStateEnum.Cont)
                {
                    IsReturnStateProcessed = true;
                    break;
                }

                target.Set(varName,VARIABLE);
                context.block().Accept(this);
            }

            target = prevTarget;
            return null;
        }

        #endregion

        #region DoWhile

        public override object VisitDoWhileLoop(MegaScryptParser.DoWhileLoopContext context)
        {
            do
            {
                if (returnState == ReturnStateEnum.Break)
                {
                    IsReturnStateProcessed = true;
                    break;
                }
                else if (returnState == ReturnStateEnum.Cont)
                {
                    IsReturnStateProcessed = true;
                }

                context.block().Accept(this);

            } while ((bool)context.expression().Accept(this));

            return null;
        }

        #endregion

        #region WhileLoop

        public override object VisitWhileLoop(MegaScryptParser.WhileLoopContext context)
        {
            while ((bool) context.expression().Accept(this))
            {
                if (returnState == ReturnStateEnum.Break)
                {
                    IsReturnStateProcessed = true;
                    break;
                }
                else if (returnState == ReturnStateEnum.Cont)
                {
                    IsReturnStateProcessed = true;
                }

                context.block().Accept(this);
            }

            return null;
        }

        #endregion
        #region Functions

        public override object VisitStatement(MegaScryptParser.StatementContext context)
        {
            if (returned)
                return lastReturnValue;

            return base.VisitStatement(context);
        }

        public override object VisitFuncDeclearation([NotNull]MegaScryptParser.FuncDeclearationContext context)
        {
            ScriptFunction function = new ScriptFunction(this,Init,context);
            return function;
        }

        public object Init(ScriptFunction function, List<object> parameters, InvocationContext ctx)
        {
            //Push new scope
            Object prevTarget = target;
            Object parentScope =  ctx != null && ctx.Container != null ? ctx.Container : prevTarget;

            target = new Object(parentScope);

            // declare parameter variables
            if (parameters != null)
            {
                if (function.ParameterNames != null && function.ParameterNames.Count != parameters.Count)
                {
                    throw new InvalidOperationException($"function {function.Name} expected{function.ParameterNames.Count} parameters but recevied {parameters.Count}");
                }

                if (function.ParameterNames != null)
                    for (int i = 0; i < function.ParameterNames.Count; i++)
                        target.Declare(function.ParameterNames[i], parameters[i]);
            }

            lastReturnValue = null;
            returned = false;
            //execute body
            base.VisitFuncDeclearation(function.DeclearationContext);

            //pop scope

            target = prevTarget;

            //return value; 
            object ret = lastReturnValue;
            lastReturnValue = null;
            returned = false;
            return ret;
        }

        public override object VisitVarList(MegaScryptParser.VarListContext context)
        {
            List<string> varList = new List<string>();

            ITerminalNode[] ids = context.Id();
            foreach (var id in ids)
            {
                string result = id.Accept(this) as string;
                varList.Add(result);
            }

            return varList;
        }

        private object lastReturnValue = null;
        private bool returned = false;
        public override object VisitReturnStmt(MegaScryptParser.ReturnStmtContext context)
        {
            if (context.expression() != null)
                lastReturnValue = context.expression().Accept(this);
            else
            {
                lastReturnValue = null;
                
            }

            returned = true;
            return lastReturnValue;
        }

        public override object VisitInvocation([NotNull]MegaScryptParser.InvocationContext context)
        {
            Object container = null;
            IFunction function = context.compoundId().Accept(this) as IFunction;
            if (context.compoundId().Id() ==null)
            {
                var obj = context.compoundId().objectGet().objectValidEntry();
                container = (Object) GetParentObject(obj);
            }
            else if (context.compoundId().Id() != null)
            {
                container = target;
            }

            if (function == null)
            {
                throw new InvalidOperationException($"Invalid function Call");
            }

            List<object> parameters = new List<object>();
            if (context.paramList() != null)
            {
                parameters = context.paramList().Accept(this) as List<object>;
            }
            //else
            //{
            //    parameters = new List<object>();
            //}

            InvocationContext ctx = new InvocationContext(container);
            object ret = function.Init(parameters, ctx);
            return ret;
        }

        public override object VisitParamList(MegaScryptParser.ParamListContext context)
        {
            List<object> parameters = new List<object>();

            MegaScryptParser.ExpressionContext[] expers = context.expression();
            foreach (var exper in expers)
            {
                object result = exper.Accept(this);
                parameters.Add(result);

            }
            context.expression();

            return parameters;
        }

        #endregion
    }
}

