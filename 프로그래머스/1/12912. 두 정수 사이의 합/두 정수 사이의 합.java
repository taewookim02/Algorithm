class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
        }
        
        for (long i = a; i <= b; i++) {
            answer += i;
        }
        
        return answer;
    }
}