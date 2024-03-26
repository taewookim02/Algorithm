import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> myStack = new Stack<>();
        
        int i = 0;
        while (i < arr.length) {
            if (myStack.isEmpty() || myStack.size() >= 1 && myStack.peek() != arr[i]) {
                myStack.push(arr[i]);
                i++;
            } else if (myStack.size() >= 1 && myStack.peek() == arr[i]) {
                myStack.pop();
                i++;
            } 
        }
        
        if (myStack.size() >= 1) {
            answer = new int[myStack.size()];
        
            for (int idx = answer.length - 1; idx >= 0; idx--) {
                answer[idx] = myStack.pop();
            }    
        } else {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}