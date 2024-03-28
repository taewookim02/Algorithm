import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        // ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (st.peek() == arr[i]) {
                continue;
            }
            st.push(arr[i]);
        }
        
        answer = st.stream().mapToInt(i -> i).toArray();
        
    
        return answer;
    }
}