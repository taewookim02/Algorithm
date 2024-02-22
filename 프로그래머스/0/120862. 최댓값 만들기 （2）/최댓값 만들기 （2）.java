import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        // solution 2
        // bubble sort O(n^2)
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > answer && i != j) {
                    answer = numbers[i] * numbers[j];
                }
            }
        }
        
        
        // 입력값 > [-2, 2]
        // 기대값 > -4
        // if 
        // System.out.println(answer);
        
        return answer;
    }
}