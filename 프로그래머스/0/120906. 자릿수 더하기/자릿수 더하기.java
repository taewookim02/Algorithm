class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] myStrArr = (n + "").split("");
        
        for (int i = 0; i < myStrArr.length; i++) {
            answer += Integer.valueOf(myStrArr[i]);
        }
        
        return answer;
    }
}