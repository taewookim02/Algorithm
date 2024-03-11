import java.util.HashMap;
import java.util.Map;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Map<Character, Integer> myMap = new HashMap();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if(myMap.containsKey(s.charAt(i))) {
                myMap.put(s.charAt(i), myMap.get(s.charAt(i)) + 1);
            } else {
                myMap.put(s.charAt(i), 1);
            }
        }

        answer = myMap.get('p') == myMap.get('y') ? true : false;

        return answer;
    }
}