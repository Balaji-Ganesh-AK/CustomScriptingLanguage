using System;
using System.Collections.Generic;
using System.IO;
using Antlr4.Runtime;
using MegaScryptLib;

namespace MegaScrypt
{
    public class Machine
    {
        private Processor processor= new Processor(); 
        private Object target;

        public Object Target => target;

        public Machine()
        {
            processor = new Processor();
            target = new Object();
            processor.Target = target;
        }

   

        public object Execute(string script)
        {
            AntlrInputStream input = new AntlrInputStream(script);
            MegaScryptLexer lexer = new MegaScryptLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MegaScryptParser parser = new MegaScryptParser(tokens);
            parser.AddErrorListener(new ThrowErrorListener());
            MegaScryptParser.ProgramContext root = parser.program();

            
            object result = root.Accept(processor);
            return result;
        }

        public object Evaluate(string expression)
        {
            AntlrInputStream input = new AntlrInputStream(expression);
            MegaScryptLexer lexer = new MegaScryptLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MegaScryptParser parser = new MegaScryptParser(tokens);

            MegaScryptParser.ExpressionContext root = parser.expression();

            object result = root.Accept(processor);
            return result;
        }

        public void Declare(NativeFunction function)
        {
            target.Declare(function.Name, function);
        } 
        public void Declare(NativeFunction.Callback callback, IEnumerable<string> parameters = null)
        {
            NativeFunction function = new NativeFunction(callback, parameters);
            target.Declare(function.Name, function);
        }

        public void Declare(string varName, object value)
        {
            target.Declare(varName,value);
        }

        class ThrowErrorListener : BaseErrorListener, IAntlrErrorListener<int>
        {
            public override void SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol,
                int line, int charPositionInLine, string msg, RecognitionException e)
            {
                throw new InvalidOperationException(null);
            }

            public void SyntaxError(TextWriter output, IRecognizer recognizer, int offendingSymbol, int line,
                int charPositionInLine, string msg, RecognitionException e)
            {
                throw new InvalidOperationException(null);
            }

        }
    }

}
