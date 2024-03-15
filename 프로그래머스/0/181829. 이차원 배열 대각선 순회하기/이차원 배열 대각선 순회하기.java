class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            int sum = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {
                    sum += board[i][j];
                }
            }
            answer += sum;
        }
        return answer;
    }
}