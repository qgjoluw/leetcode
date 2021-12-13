import scala.collection.mutable.Stack
object Solution {
    def isValid(s: String): Boolean = {
        if (s == null)  return false
        
        var st = Stack[Char]()
        for (i<- 0 to s.length-1)
        {
            if (s(i) == '(' || s(i) == '[' || s(i) == '{')
            {
                st.push(s(i))
            }
            else if (st.isEmpty == false && st.top == '(' && s(i) ==')')
            {
                st.pop
            }
            else if (st.isEmpty == false && st.top == '[' && s(i) ==']')
            {
                st.pop
            }
            else if (st.isEmpty == false && st.top == '{' && s(i) =='}')
            {
                st.pop
            }
            else
            {
                return false
            }
        }
        return st.isEmpty
    }
}
