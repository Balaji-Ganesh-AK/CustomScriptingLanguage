using System;
using System.Diagnostics;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
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
    }

}
