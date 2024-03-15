class Solution {
    public String solution(String s) {
        String answer = "";
        String[] myArr = s.split(" ");
        int min = Integer.parseInt(myArr[0]);
        int max = Integer.parseInt(myArr[0]);
        for (int i = 1; i < myArr.length; i++) {
            if (Integer.parseInt(myArr[i]) < min) {
                min = Integer.parseInt(myArr[i]);
            }
            if (Integer.parseInt(myArr[i]) > max) {
                max = Integer.parseInt(myArr[i]);
            }
        }
        
        answer += min;
        answer += " " + max;
        
        return answer;
    }
}