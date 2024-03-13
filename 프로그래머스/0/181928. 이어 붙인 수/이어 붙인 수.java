class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String evenStr = "";
        String oddStr = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenStr += num_list[i];
            } else {
                oddStr += num_list[i];
            }
        }
        
        answer = Integer.parseInt(evenStr) + Integer.parseInt(oddStr);
        return answer;
    }
}