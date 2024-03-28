import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == ')') return false;
            
            if (s.charAt(i) == '(') {
                st.push('(');
            }
            if (st.size() > 0 && s.charAt(i) == ')') {
                st.pop();
            }
        }
        if (st.size() > 0) return false;
        
        
        return answer;
    }
}