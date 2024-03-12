class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int pLen = p.length();
        
        for (int i = 0; i <= t.length() - pLen; i++) {
            long myNum = Long.parseLong(t.substring(i, i + pLen));
            
            if (myNum <= Long.parseLong(p)) {
                answer++;
            }
            
        }
        return answer;
    }
}