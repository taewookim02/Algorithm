class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        
        for (int val : num_list) {
            if (val == n) {
                answer = 1;
            }
        }
        
        return answer;
    }
}