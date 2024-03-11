class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int myNum = 0;
        int myNum2 = 0;
        
        myNum = Integer.parseInt("" + a + b);
        myNum2 = 2 * a * b;
        answer = myNum > myNum2 ? myNum : myNum2;

        
        return answer;
    }
}