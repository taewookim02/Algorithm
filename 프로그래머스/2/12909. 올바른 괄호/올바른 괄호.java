import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
    
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == ')') {
                return false;
            }
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else if (st.size() > 0) {
                st.pop();
            }
        }
        if (st.size() > 0) {
            return false;
        }
        
        System.out.println(st);
        return answer;
    }
}