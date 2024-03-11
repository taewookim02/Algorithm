import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String myStr = n + "";
        for (int i = 0; i < myStr.length(); i ++) {
            answer += Character.getNumericValue(myStr.charAt(i));
        }

        return answer;
    }
}