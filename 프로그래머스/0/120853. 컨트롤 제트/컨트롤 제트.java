class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] myArr = s.split(" ");
        for (int i = 0; i < myArr.length; i++) {
            if (!myArr[i].equals("Z")) {
                answer += Integer.parseInt(myArr[i]);
            }
            if (myArr[i].equals("Z")) {
                answer -= Integer.parseInt(myArr[i - 1]);
            }
        }
        return answer;
    }
}