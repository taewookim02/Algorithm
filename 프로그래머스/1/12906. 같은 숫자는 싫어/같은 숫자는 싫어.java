import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> myStack = new Stack();
        myStack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            
            Integer temp = (int)myStack.peek();
            if (temp == arr[i]) {
                continue;
            } else {
                myStack.push(arr[i]);    
            }
        }
        answer = new int[myStack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = myStack.pop();
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
}