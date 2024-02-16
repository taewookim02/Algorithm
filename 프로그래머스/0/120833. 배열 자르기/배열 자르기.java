import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        int[] slicedArray = Arrays.copyOfRange(numbers, num1, num2 + 1);
        
        // numbers = numbers.slice(num1, num2);
        return (slicedArray); 

        // return answer;
    }
}