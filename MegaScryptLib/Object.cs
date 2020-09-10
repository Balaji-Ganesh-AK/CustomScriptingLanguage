using System;
using System.Collections.Generic;
using System.Runtime.CompilerServices;

namespace MegaScrypt
{
    public class Object
    {
        private Object parent = null;
        public Object Parent => parent;
        private Dictionary<string, object> variables = new Dictionary<string, object>();

      

        public Object(Object parent = null)
        {
            this.parent = parent;
        }
        public List<string> variableNames => new List<string>(variables.Keys);
        public void Declare(string varName, object value = null)
        {
            if(variables.ContainsKey(varName))
                throw new InvalidOperationException($"Variable\"{varName}\"is already declared.");
            variables.Add(varName, value);
        }

        public object Get(string varName, bool allowParentChaining = true)
        {
            if (variables.ContainsKey(varName))
                return variables[varName];
            if (allowParentChaining && parent != null)
            {
                return parent.Get(varName, true);
            }
            throw new NotImplementedException($"Variable \"{varName}\" is not declared.");
        }

        public void Set(string varName, object value, bool allowParentChaining = true)
        {
            if (variables.ContainsKey(varName))
            {

                variables[varName]=value;
                return;
            }

            if (allowParentChaining && parent != null)
            {
                parent?.Set(varName,value,true);
                return;
            }
            
             throw new NotImplementedException($"Variable \"{varName}\" is not declared.");
            
        }

        public bool Has(string varName, bool allowParentChaining = true)
        {
            bool has = variables.ContainsKey(varName);
            if (!has && allowParentChaining && parent != null)
            {
                has = parent.Has(varName, true);
            }

            return has;
        }
    }
}
