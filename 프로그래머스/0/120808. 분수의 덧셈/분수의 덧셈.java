class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // int[] answer = {};
        int[] answer = new int[2];
        // 1, 2, 3, 4
        // 1, 1, 2, 2
        int finalNumerA = numer1 * denom2; // 1 * 4 = 4 // 1 * 2 = 2
        int finalNumerB = numer2 * denom1; // 3 * 2 = 6 // 2 * 1 = 2
        int finalNumer = finalNumerA + finalNumerB;  // 4 + 6 = 10 // 2 + 2 = 4
        int finalDenom = denom1 * denom2; // 2 * 4 = 8 // 2
        
        int a = 0;
        int b = 0;
        
        if (finalNumer > finalDenom) {
            for (int i = 2; i < finalNumer; i++) {
                if (finalNumer % i == 0 && finalDenom % i == 0) {
                    a = finalNumer / i;
                    b = finalDenom / i;
                }
            }
        } else {
            for (int i = 2; i < finalDenom; i++) {
                if (finalNumer % i == 0 && finalDenom % i == 0) {
                    a = finalNumer / i;
                    b = finalDenom / i;
                }
            }
        }
        

        // 만약 % i ==0 이 둘 다 없을 때
        // a, b는 그냥 finalNumer, finalDenom
        if (a == 0 && b == 0) {
            a = finalNumer;
            b = finalDenom;
        }
        
        // System.out.println(a);
        // System.out.println(b);
                
        if (a == 2 && b == 2) {
            a = 1;
            b = 1;
        }
        
        answer[0] = a;
        answer[1] = b;


        
        return answer;
    }
}