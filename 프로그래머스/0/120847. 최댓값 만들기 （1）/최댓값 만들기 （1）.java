class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int max = numbers[0] > numbers[1] ? numbers[0] : numbers[1];
        int secondMax = numbers[0] + numbers[1] - max;
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax) {
                secondMax = numbers[i];
            }
        }
        
        answer = max * secondMax;
        
        return answer;
    }
}