import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Map<Integer, Integer> myMap = new HashMap();
        for (int val : numbers) {
            myMap.put(val, 1);
        }
        
        
        for (int i = 0; i < 10; i++) {
            if (myMap.get(i) == null) {
                answer += i;
            }
        }

        return answer;
    }
}