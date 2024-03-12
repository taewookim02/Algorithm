class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        for (int i = 0; i < d.length - 1; i++) {
            for (int j = 0; j < d.length - 1 - i; j++) {
                if (d[j] > d[j + 1]) {
                    int temp = d[j];
                    d[j] = d[j + 1];
                    d[j + 1] = temp;
                }
            }
        }
        
        for (int val : d) {
            if (budget >= val) {
                budget -= val;
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}