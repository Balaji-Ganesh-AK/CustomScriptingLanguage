using System.Collections;
using System.Collections.Generic;

namespace MegaScrypt
{
    public class Array: Object, IEnumerable<object>
    {
        private List<object> list;

        public IEnumerator<object> GetEnumerator() => list.GetEnumerator();

        public List<object> Tolist()=>new List<object>(list);
        IEnumerator IEnumerable.GetEnumerator() => this.GetEnumerator();


        public List<object> ToList() => new List<object>(list);

        public object this[int i]
        {
            get => list[i];
            set => list[i] = value;
        }

        public int Count => list.Count;

        public Array()
        {
            Bind();
            list =new List<object>();
        }

        public Array(IEnumerable<object> list)
        {
            Bind();
            this.list = new List<object>(list);
        }

        private void Bind()
        {
            Declare(Add);
            Declare(AddRange);
            Declare(Insert);
            Declare(RemoveAt);
            Declare(Clear);
            Declare("Count", () => list.Count);
        }


        private object Add(List<object> parameters)
        {
            list.Add(parameters[0]);
            return null;
        }

        private void Add(object o) => list.Add(o);


        private object AddRange(List<object> parameters)
        {
            list.AddRange(parameters[0] as IEnumerable<object>);
            return null;
        }

        public void AddRange(IEnumerable<object> objects) => list.AddRange(objects);


        private object Insert(List<object> parameters)
        {
            list.Insert((int)parameters[0], parameters[1]);
            return null;
        }

        public void Insert(int index, object o) => list.Insert(index, o);

        private object RemoveAt(List<object> parameters)
        {
            list.RemoveAt((int)parameters[0]);
            return null;
        }

        public void RemoveAt(int index) => list.RemoveAt(index);

        private object Clear(List<object> parameters)
        {
            list.Clear();
            return null;
        }

        public void Clear() => list.Clear();
    }

}

