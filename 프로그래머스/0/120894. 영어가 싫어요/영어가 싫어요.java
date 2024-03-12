class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] myArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < myArr.length; i++) {
            numbers = numbers.replace(myArr[i], Integer.toString(i));
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}