import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for (String parti : participant) {
            map.put(parti, map.getOrDefault(parti, 0) + 1);
        }
        
        for (String comp : completion) {
            map.put(comp, map.getOrDefault(comp, 0) - 1);
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }
        
        
        return answer;
    }
}