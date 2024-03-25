import java.util.Stack;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        Stack<Integer> myStack = new Stack<>();
        // 빈 배열 X가 
        // 길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어질 때
        // flag를 차례대로 순회하며
        // flag[i]가 true라면
        //     X의 뒤에 arr[i]를 arr[i] × 2 번 추가
        // flag[i]가 false라면
        //     X에서 마지막 arr[i]개의 원소를 제거
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    myStack.push(arr[i]);
                }
            } else if (!flag[i]) {
                for (int j = 0; j < arr[i]; j++) {
                    myStack.pop();
                }
            }
        }
        answer = myStack.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}