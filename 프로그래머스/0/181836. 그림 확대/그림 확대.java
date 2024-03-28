import java.util.Arrays;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        Arrays.fill(answer, "");
        
        // arr length * k
        // arr elem string * k
        int ansIdx = 0;
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < k; j++) {
                for (int charIdx = 0; charIdx < picture[i].length(); charIdx++) {
                    for (int times = 0; times < k; times++) {
                        answer[ansIdx] += picture[i].charAt(charIdx);
                    }
                }
                ansIdx++;
            }
        }
        
        for (String str : answer) {
            System.out.println(str);
        }
        return answer;
    }
}