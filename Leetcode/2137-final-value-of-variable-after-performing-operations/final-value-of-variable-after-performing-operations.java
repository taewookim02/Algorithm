class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int answer = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("+")) {
                answer++;
            } else {
                answer--;
            }
        }
        return answer;
    }
}