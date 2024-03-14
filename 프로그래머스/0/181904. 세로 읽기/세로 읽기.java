class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[][] myArr = new String[my_string.length() / m][m];
        int index = 0; 
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < m; j++) {
                myArr[i][j] = my_string.charAt(index) + "";
                index++;
            }
        }
        
        for (String[] strArr : myArr) {
            answer += strArr[c - 1];
        }
                
        
        return answer;
    }
}