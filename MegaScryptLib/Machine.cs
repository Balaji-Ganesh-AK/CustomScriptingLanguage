using System;
using System.IO;
using Antlr4.Runtime;

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
            DNEScryptLexer lexer = new DNEScryptLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DNEScryptParser parser = new DNEScryptParser(tokens);
            parser.AddErrorListener(new ThrowErrorListener());
            DNEScryptParser.ProgramContext root = parser.program();

            
            object result = root.Accept(processor);
            return result;
        }

        public object Evaluate(string expression)
        {
            AntlrInputStream input = new AntlrInputStream(expression);
            DNEScryptLexer lexer = new DNEScryptLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DNEScryptParser parser = new DNEScryptParser(tokens);

            DNEScryptParser.ExpressionContext root = parser.expression();

            object result = root.Accept(processor);
            return result;
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
