class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String myStr = "";
        
        for(int val : array) {
            myStr += (val + "");
        }
        
        for (char val : myStr.toCharArray()) {
            if (val == '7') {
                answer++;
            }
        }
        
        return answer;
    }
}