import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {  // Closing brackets
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.peek();
                if ((top == '(' && ch == ')') ||
                    (top == '{' && ch == '}') ||
                    (top == '[' && ch == ']')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
