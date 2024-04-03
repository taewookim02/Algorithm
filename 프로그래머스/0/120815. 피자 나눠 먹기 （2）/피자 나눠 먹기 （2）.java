class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 최대공약수 / 피자 갯수
        answer = lcm(n, 6) / 6;
        
        // 6과 n의 최소공배수
        System.out.println(answer);
        
        
        return answer;
    }
    
    // least common multiple
    private static int lcm (int a, int b) {
        int lcm = (a * b) / gcd(a, b);
        return lcm;
    }
    
    // greatest common divisor
    private static int gcd (int a, int b) {
        int r = 0;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}