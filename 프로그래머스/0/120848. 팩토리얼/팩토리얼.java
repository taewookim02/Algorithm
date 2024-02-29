class Solution {
    public int solution(int n) {
        int factorialTracker = 1;
        int answer = 0;
        for (int i = 1; factorialTracker <= n; i++) {
            factorialTracker *= i;
            if (n == factorialTracker) {
                answer = i;
                break;
            } 
            if (n < factorialTracker) {
                answer = i - 1;
                break;
            }
        }
        return answer;
    }
}