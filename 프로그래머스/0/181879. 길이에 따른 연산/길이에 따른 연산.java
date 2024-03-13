class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        answer = num_list.length <= 10 ? 1 : 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list.length <= 10) {
                answer *= num_list[i];
            } else {
                answer += num_list[i];
            }
        }
        return answer;
    }
}