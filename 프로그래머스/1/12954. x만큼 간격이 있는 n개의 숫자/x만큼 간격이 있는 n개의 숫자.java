class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n];
        // x부터 시작
        // x씩 증가
        // n개
        int count = 0;
        
        for (long i = x; count < n; i += x) {
            // System.out.println(i);
            answer[count] = i;
            count++;
        }
        
        return answer;
    }
}