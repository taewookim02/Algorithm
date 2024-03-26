import java.util.Stack;
class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        int i = 0;
        Stack<Integer> myStack = new Stack<>();
        
        while (i < arr.length) {
            if (myStack.isEmpty()) {
                myStack.push(arr[i]);
                i++;
            } else if (myStack.size() >= 1 && myStack.peek() < arr[i]) {
                myStack.push(arr[i]);
                i++;
            } else if (myStack.size() >= 1 && myStack.peek() >= arr[i]) {
                myStack.pop();
            }
        }
        stk = new int[myStack.size()];
        for (int idx = stk.length - 1; idx >= 0; idx--) {
            stk[idx] = myStack.pop();
        }
        
        return stk;
    }
}