class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n, m), lcm(n, m)};
        
        return answer;
    }
    
    static private int gcd (int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    static private int lcm (int a, int b) {
        return a * b / gcd(a, b);
    }
}