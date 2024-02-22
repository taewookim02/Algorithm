import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> answerArr = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answerArr.add(i);
            }
        }
        
        int[] answer = answerArr.stream().mapToInt(i -> i).toArray();
        
        
        return answer;
    }
}