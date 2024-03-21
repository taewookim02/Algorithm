class Solution {
    public int solution(int num1, int num2) {
        int answer = recursiveMultiply(num1, num2);
        return answer;
    }
    private static int recursiveMultiply(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 + recursiveMultiply(num1, num2 - 1);
    }
}