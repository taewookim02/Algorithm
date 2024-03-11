import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        // 가장 작은 수 
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        
        ArrayList<Integer> myList = new ArrayList();

        for (int val : arr) {
            if (val != min) {
                myList.add(val);
            }
        }
        

        answer = myList.stream().mapToInt(i -> i).toArray();
        
                
        return answer;
    }
}