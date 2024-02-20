class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] myArr = my_string.split("");
        for (int i = 0; i < myArr.length; i++) {
            if (!myArr[i].equals(letter)) {
                answer += myArr[i];
            }
        }
        
        return answer;
    }
}