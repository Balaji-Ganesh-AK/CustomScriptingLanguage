using System;
using System.Collections.Generic;
using System.Text;

namespace MegaScryptLib
{
    interface IFunction
    {
        string Name { get; }
        List<string> ParameterNames { get; }

        //object Init(List<object> parameter);

        object Init(List<object> parameter, InvocationContext ctx = null);
    }
}
