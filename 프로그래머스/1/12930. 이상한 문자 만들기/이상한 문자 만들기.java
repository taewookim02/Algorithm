class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer += ' ';
                count = 0;
            } else if (count % 2 == 0) {
                answer += (char)(s.charAt(i) - 32); 
                count++;
            } else if (count % 2 == 1) {
                answer += s.charAt(i);
                count++;
            }
        }
        
        System.out.println(answer);
        return answer;
    }
}