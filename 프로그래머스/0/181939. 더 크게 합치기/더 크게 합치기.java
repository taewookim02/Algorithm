class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int myStrAb = Integer.parseInt("" + a + b);
        int myStrBa = Integer.parseInt("" + b + a);
        answer = myStrAb > myStrBa ? myStrAb : myStrBa;
        return answer;
    }
}