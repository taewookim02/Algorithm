class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        // (?<=\\G...)
        String myRegexSpace = "(?<=\\G";
        for (int i = 0; i < n; i++) {
            myRegexSpace += ".";        
            if (i == n - 1) {
                myRegexSpace += ")";        
            }
        }
        
        answer = my_str.split(myRegexSpace);
        
        return answer;
    }
}