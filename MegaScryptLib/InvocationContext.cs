
using MegaScrypt;

namespace MegaScryptLib
{
    public class InvocationContext
    {
        private Object container;

        public Object Container => container;
        public InvocationContext(Object container)
        {
            this.container = container;
        }
    }
}
