class Solution {
    public int solution(int a, int b) {
        // a && b 홀수
        if (a % 2 == 1 && b % 2 == 1) {
            return allOdd(a, b);
        }
        // a || b 홀수
        if (a % 2 == 1 || b % 2 == 1) {
            return oneOdd(a, b);
        }
        
        return noOdd(a, b);
    }
    
    private static int allOdd(int a, int b) {
        return a * a + b * b;
    }
    
    private static int oneOdd(int a, int b) {
        return 2 * (a + b);
    }
    
    private static int noOdd(int a, int b) {
        return Math.abs(a - b);
    }
}