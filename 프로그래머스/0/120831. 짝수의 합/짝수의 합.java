class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 정수 n이 주어질 때, 
        // n이하의 짝수를 모두 더한 값을 return 
        
        for (int i = 1; i <= n; i++) {
           if (i % 2 == 0) {
               answer += i;
           }
        }
        
        return answer;
    }
}