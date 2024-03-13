class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        
        for (int i = 0, j = start_num; i < answer.length; i++, j++) {
            answer[i] = j;
        }
        return answer;
    }
}