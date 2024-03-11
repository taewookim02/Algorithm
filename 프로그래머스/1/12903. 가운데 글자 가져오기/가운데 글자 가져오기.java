class Solution {
    public String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 0) {
            // 짝수 (syso myNum - 1, myNum)
            int myNum = s.length() / 2;
            answer += s.charAt(myNum - 1);
            answer += s.charAt(myNum);
        } else { 
            // 홀수 (syso myNum)
            int myNum = s.length() / 2;
            answer += s.charAt(myNum);
        }
        
        
        return answer;
    }
}