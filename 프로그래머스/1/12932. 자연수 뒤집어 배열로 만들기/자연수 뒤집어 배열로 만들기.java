class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String myStr = "";
        String nStr = n + "";
        
        for (int i = nStr.length() - 1; i >= 0; i--) {
            myStr += nStr.charAt(i);
        }
        
        String[] myArr = myStr.split("");
        answer = new int[myArr.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(myArr[i]);
        }

        return answer;
    }
}