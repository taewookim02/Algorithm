class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            boolean isUpper = s.charAt(i) <= 90 ? true : false; 
            int sum = s.charAt(i) + n;
            if (s.charAt(i) == ' ') {
                answer += s.charAt(i);
            } else if (isUpper) {
                // int sum = s.charAt(i) + n;
                if (sum > 90) {
                    int base = 65;
                    int diff = sum - 90; // 4
                    int newPosition = base + diff - 1;
                    answer += (char)newPosition;
                } else {
                    answer += (char)sum;
                }

            } else if (!isUpper) {
                // int sum = s.charAt(i) + n;
                if (sum > 122) {
                    int base = 97;
                    int diff = sum - 122;
                    int newPosition = base + diff - 1;
                    answer += (char)newPosition;
                } else {
                    answer += (char)sum;
                }
            }
        }
            
        return answer;
    }
}