class Solution {
    public int solution(int price) {
        int answer = 0;
        // price >= 100000 // 5% 
        // price >= 300000 // 10%
        // price >= 500000 // 20%
        double discountRate = price >= 500000 ? 0.8 : price >= 300000 ? 0.9 : price >= 100000 ? 0.95 : 1;
        answer = (int)(price * discountRate);
        return answer;
    }
}