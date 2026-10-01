// class Solution {
//     public boolean isValid(String str) {
//         Stack<Character> st = new Stack();
//         int n =str.length();
//         for(int i=0; i<n;i++){
//             char ch  = str.charAt(i);
//             if(ch=='('){
//                 st.push(ch);
//             }
//             else{
//                if (st.size()==0) return false;
//                if (st.peek()=='(') st.pop();
//             }
//         }
//             if(st.size()>0) return false;
//             else return true;
        
//     }
// }
import java.util.*;

class Solution {
    public boolean isValid(String str) {
        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}