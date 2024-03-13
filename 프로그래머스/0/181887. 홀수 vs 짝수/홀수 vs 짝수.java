class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int oddNum = 0;
        int evenNum = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                // "홀수"
                oddNum += num_list[i];
            } else {
                evenNum += num_list[i];
            }
        }
        
        answer = oddNum > evenNum ? oddNum : evenNum;
        return answer;
    }
}