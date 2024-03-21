class Solution {
    public int solution(int num1, int num2) {
        // return recursiveRemainder(num1, num2);     
        return recursiveModulo(num1, num2);     
    }
    
    // private static int recursiveRemainder(int dividend, int divisor) {
    //     if (dividend - divisor <= 0) {
    //         return divisor - dividend;
    //     }
    //     return recursiveRemainder(dividend - divisor, divisor);
    // }
    
    private static int recursiveModulo(int a, int b) {
        if (a < b) {
            return a;
        }
        
        return recursiveModulo(a - b, b);
    }
}