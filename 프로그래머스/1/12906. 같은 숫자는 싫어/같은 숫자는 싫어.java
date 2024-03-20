import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> myStack = new Stack();
        myStack.push(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if (myStack.peek() == arr[i]) {
                continue;
            } else {
                myStack.push(arr[i]);
            }
        }
        answer = new int[myStack.size()];
        for (int i = answer.length-1; i >= 0; i--) {
            answer[i] = myStack.pop();
        }
        
        System.out.println(myStack);
        
        return answer;
    }
}