class Solution {
    public int solution(int n) {
        int answer = 0;
        /*
        n = 20
        1 20
        2 10
        4 5
        5 4
        10 2
        20 1
        */
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }
        return answer;
    }
}