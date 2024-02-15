class Solution {
    public int solution(int num1, int num2) {
        double myDouble = (double)num1 / num2;
        double answer = myDouble * 1000;
        return (int)answer;
    }
}