import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack myStack = new Stack();
        myStack.push(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if ((int)myStack.peek() == arr[i]) {
                continue;
            } else {
                myStack.push(arr[i]);
            }
        }
        
        // stack to int arr
        answer = new int[myStack.size()];
        
        for (int i = answer.length-1; i >= 0; i--) {
            answer[i] = (int)myStack.pop();
        }
        
        return answer;
    }
}