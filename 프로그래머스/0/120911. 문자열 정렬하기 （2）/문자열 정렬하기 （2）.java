import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
		for (char ch : my_string.toCharArray()) {
			answer += Character.toLowerCase(ch);
		}
        
		String[] myArr = answer.split("");
        Arrays.sort(myArr);

        answer = String.join("", myArr);
        
        
        return answer;
    }
}