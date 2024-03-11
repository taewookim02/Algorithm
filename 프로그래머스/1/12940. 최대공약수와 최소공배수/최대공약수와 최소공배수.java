class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n, m), lcm(n, m)};
        return answer;
    }
    
    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}