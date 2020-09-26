using System;
using System.Collections.Generic;
using System.Text;
using MegaScryptLib;

namespace MegaScrypt
{
    public class NativeFunction :IFunction
    {
        private string name;
        private List<string> _parameterNames;
        private Callback _callback;



        public string Name => name;
        public List<string> ParameterNames => _parameterNames;

        public delegate object Callback(List<object> parameters);


        public NativeFunction(Callback callback, IEnumerable<string> parameterNames)
        {
            this._callback = callback;
            this._parameterNames = parameterNames != null ? new List<string>(parameterNames) : null;
            this.name = callback.Method.Name;
        }

        public NativeFunction(string functionName, Callback callback)
        {
            this._callback = callback;
            this._parameterNames = null;
            this.name = functionName;
        }

        public object Init(List<object> parameters,InvocationContext ctx)
        {
            object ret = _callback.Invoke(parameters);
            return ret;
        }
    }
}
