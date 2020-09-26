using System;
using System.Collections.Generic;
using System.Text;
using Antlr4.Runtime.Tree;
using MegaScrypt;
using Object = MegaScrypt.Object;

namespace MegaScryptLib
{
    public class ScriptFunction:IFunction
    {
        private string name;
        private List<string> parameterNames; 

        public string Name => name;

        public List<string> ParameterNames => parameterNames;
        private MegaScryptParser.FuncDeclearationContext _declearationContext;
        public MegaScryptParser.FuncDeclearationContext DeclearationContext => _declearationContext;


        public delegate object Invocation(ScriptFunction function, List<object> parameters,InvocationContext ctx);

        private Invocation invocation;
        public ScriptFunction(Processor processor, Invocation invocation,MegaScryptParser.FuncDeclearationContext declearationContext)
        {
            this.invocation = invocation;
            this._declearationContext = declearationContext;
            this.name = FindName(processor);
            if (declearationContext.varList() != null)
            {
                this.parameterNames = declearationContext.varList().Accept(processor) as List<string>;
            }
            else
            {
                this.parameterNames = new List<string>();
            }

        }

        public object Init(List<object> parameter, InvocationContext ctx)
        {
            return invocation.Invoke(this, parameter,ctx);
        }

        private string FindName(Processor processor)
        {
            IRuleNode node = _declearationContext.Parent;
            while (node != null)
            {
                MegaScryptParser.DeclarationContext varContext = node as MegaScryptParser.DeclarationContext;

                if (varContext!=null)
                {
                    return varContext.Id().Accept(processor) as string;
                }

                node = node.Parent;
            }

            return null;
        }
    }
}
