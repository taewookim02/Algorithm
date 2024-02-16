class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        // 각 문자를 3번 씩 출력
        String[] myArr = my_string.split("");
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < n; j++) {
                answer += myArr[i];
            }
        }

        return answer;
    }
}