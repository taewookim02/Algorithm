import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length]; 
        int[] sortedArr = Arrays.copyOf(emergency, emergency.length);
        
        for (int i = 0; i < sortedArr.length - 1; i++) {
            for (int j = 0; j < sortedArr.length - 1 - i; j++) {
                if (sortedArr[j] < sortedArr[j + 1]) {
                    int temp = sortedArr[j + 1];
                    sortedArr[j + 1] = sortedArr[j];
                    sortedArr[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] == sortedArr[j]) {
                    answer[i] = j + 1;
                }
            }
        }
        
//         for (int val : answer) {
//             System.out.println(val);
//         }
        
        
        return answer;
    }
}