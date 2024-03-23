class Solution {
    public int[] solution(String myString) {
        String[] myArr = myString.split("x", -1);
        int[] answer = new int[myArr.length];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = myArr[i].length();
        }
        return answer;
    }
}