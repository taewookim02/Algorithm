class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        // starting 
        answer = my_string.substring(0, s);
        
        // middle
        answer += overwrite_string;
        
        // end
        int overLen = overwrite_string.length();
        answer += my_string.substring(overLen + my_string.substring(0, s).length());
        
        return answer;
    }
}