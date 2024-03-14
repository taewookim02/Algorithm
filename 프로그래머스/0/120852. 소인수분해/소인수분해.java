import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> mySet = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            while(n % i == 0) {
                mySet.add(i);
                n = n / i;
            }
            if (i * i > n) {
                break;
            }
        }
        if (n > 1) {
            mySet.add(n);
        }

        // set to arr
        answer = new int[mySet.size()];
        int idx = 0;
        for (int val : mySet) {
            answer[idx++] = val;
        }
        
        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = 0; j < answer.length - 1 - i; j++) {
                if (answer[j] > answer[j + 1]) {
                    int temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
            }
        }
                
        return answer;
    }
}