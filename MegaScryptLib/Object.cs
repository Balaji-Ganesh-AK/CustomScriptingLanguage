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


        public delegate object Getter();

        public delegate void Setter(object value);

        private Dictionary<string, Getter> _getters = new Dictionary<string, Getter>();
        private Dictionary<string, Setter> _setters= new Dictionary<string, Setter>();


        public void Declare(string varName, Getter getter, Setter setter = null)
        {
            if (getter != null)
            {
                _getters.Add(varName, getter);
            }

            if (_setters != null)
            {
                _setters.Add(varName, setter);
            }
        }


        public Object(Object parent = null)
        {
            this.parent = parent;
        }
        public List<string> variableNames => new List<string>(variables.Keys);

        public Dictionary<string, string> variableToPrint = new Dictionary<string, string>(); 

        public void Declare(string varName, object value = null)
        {
            if (varName == "prototype")
            {
                parent = value as Object;
                return;
            }

            if(variables.ContainsKey(varName))
                throw new InvalidOperationException($"Variable\"{varName}\"is already declared.");
            variables.Add(varName, value);
        }

        public void Declare(NativeFunction.Callback callback, IEnumerable<string> parameterNames = null)
        {
            Declare(new NativeFunction(callback, parameterNames));
        }

     

        public void Declare(NativeFunction function)
        {
            Declare(function.Name, function);
        }


        public void AddToPrintList(string stringToPrint, string varName, bool allowParentChaining = true)
        {
            if (variables.ContainsKey(varName))
            {
                if (variableToPrint.ContainsKey(varName))
                {
                    variableToPrint[varName] = stringToPrint;
                }
                else
                {
                    
                    variableToPrint.Add(varName, stringToPrint);
                }

                return;
            }
            if (allowParentChaining && parent != null)
            {
                parent.AddToPrintList(stringToPrint, varName, true);

            }
            else
            {
                throw new InvalidOperationException($"Variable\"{varName}\"is already declared.");
                
            }
            
        }

        public object Get(string varName, bool allowParentChaining = true)
        {
            if (varName == "prototype")
            {
                return parent;
            }

            if (_getters.ContainsKey(varName))
            {
                return _getters[varName]?.Invoke();
            }

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
            if (varName == "prototype")
            {
                parent = value as Object;
                return;
            }

            if (_getters.ContainsKey(varName))
            {
                _setters[varName]?.Invoke(value);
                return;
            }

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
            if (varName == "prototype")
            {
                return parent != null;
            }

            if (_getters.ContainsKey(varName))
            {
                return true;
            }

            bool has = variables.ContainsKey(varName);
            if (!has && allowParentChaining && parent != null)
            {
                has = parent.Has(varName, true);
            }

            return has;
        }

       
    }
}
