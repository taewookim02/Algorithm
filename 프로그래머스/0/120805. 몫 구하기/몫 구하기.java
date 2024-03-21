class Solution {
    public int solution(int num1, int num2) {
        return recursiveDivision(num1, num2);
    }
    
    private static int recursiveDivision(int dividend, int divisor) {
        if (dividend < divisor) {
            return 0;
        }
        
        return 1 + recursiveDivision(dividend - divisor, divisor);
    }
}