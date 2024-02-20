class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] myArr = cipher.split("");
        for (int i = code - 1; i < myArr.length; i += code) {
            answer += myArr[i];
        }
        System.out.println(answer);
        return answer;
    }
}