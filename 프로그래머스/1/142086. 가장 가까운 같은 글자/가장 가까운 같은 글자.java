import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> lastSeen = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (lastSeen.containsKey(currChar)) {
                answer[i] = i - lastSeen.get(currChar);
            } else {
                answer[i] = -1;             
            }
            lastSeen.put(currChar, i);
        }
        
        return answer;
    }
}