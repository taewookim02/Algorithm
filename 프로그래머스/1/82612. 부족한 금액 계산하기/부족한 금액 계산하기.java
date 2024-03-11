class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        for (long i = 1; i <= count; i++) {
            total = total + price * i;
        }
        // 30 - 20
        answer = total - money;
        if (money > total) {
            answer = 0;
        }

        return answer;
    }
}