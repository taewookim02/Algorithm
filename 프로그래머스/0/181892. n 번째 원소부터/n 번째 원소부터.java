class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int length = num_list.length - n + 1;
        answer = new int[length];
        for (int i = n - 1, j = 0; i < num_list.length; i++, j++) {
            answer[j] = num_list[i];
        }
        return answer;
    }
}