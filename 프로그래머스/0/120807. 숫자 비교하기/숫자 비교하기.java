class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        // 같으면 1 다르면 -1
        answer = num1 == num2 ? 1 : -1;
        return answer;
    }
}