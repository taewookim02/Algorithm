class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
      
//         for (int i = 0; i < my_strings.length; i++) {
            
//         }
        for (int i = 0; i < parts.length; i++) {
            int startIndex = parts[i][0];
            int endIndex = parts[i][1];
            answer += my_strings[i].substring(startIndex, endIndex + 1);
        }
        return answer;
    }
}