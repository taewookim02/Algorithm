class Solution {
    public int solution(int n) {
        int answer = 0;

        answer = lcm(6, n);
        
        return answer;
    }
    
    private int lcm(int a, int b) {
        int lcm = (a * b) / gcd(a, b);
        int num = lcm / 6;
        return num;
    }
    
    private int gcd(int a, int b) {
        int r = 0;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        
        return a;
    }
}