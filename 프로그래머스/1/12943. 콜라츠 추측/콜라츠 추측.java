class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        
        while (count < 500) {
            if (num == 1) {
                break;
            }
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 2 == 1) {
                num = (num * 3) + 1;
            }
            count++;
        }
        
        answer = count != 500 ? count : -1;
        return answer;
    }
}