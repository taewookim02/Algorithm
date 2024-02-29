class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String compareK = String.valueOf(k);

        for (int index = i; index <= j; index++) {
            String[] myArr = String.valueOf(index).split("");
            for (String val : myArr) {
                if (val.equals(compareK)) {
                    answer++;
                }
            }
            
        }
        return answer;
    }
}