import java.util.Set;
import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        Set<Character> mySet = new LinkedHashSet<>();
        for (int i = 0; i < my_string.length(); i++) {
            mySet.add(my_string.charAt(i));
        }
        
        for (char ch : mySet) {
            answer += ch;
        }
        
        return answer;
    }
}