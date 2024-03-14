class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if (a != b && a != c && b != c) {
            answer = allDiff(a, b, c);
        } else if (a == b && a == c) {
            answer = allSame(a, b, c);
        } else {
            answer = oneDiff(a, b, c);
        }
        
        return answer;
    }
    
    private static int allDiff(int a, int b, int c) {
        return a + b + c;
    }
    private static int oneDiff(int a, int b, int c) {
        return (a + b + c) * ((a * a) + (b * b) + (c * c));
    }
    private static int allSame(int a, int b, int c) {
        return (a + b + c) * ((a * a) + (b * b) + (c * c)) * ((a * a * a) + (b * b * b) + (c * c * c));
    }
}