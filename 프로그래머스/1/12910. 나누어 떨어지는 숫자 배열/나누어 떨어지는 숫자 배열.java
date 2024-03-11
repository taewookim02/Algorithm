import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList();
    
        // adding to answer
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
            if (i == arr.length - 1 && answer.size() == 0) {
                answer.add(-1);
            }
        }

        int[] myArr = answer.stream().mapToInt(i -> i).toArray();
        
        // bubble sort
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr.length - 1; j++) {
                if (myArr[j] > myArr[j + 1]) {
                    int temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }
        
        
        return myArr;
    }
}