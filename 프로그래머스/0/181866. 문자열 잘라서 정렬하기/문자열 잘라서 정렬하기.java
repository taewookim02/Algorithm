import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        ArrayList<String> myArr = new ArrayList<>();
        answer = myString.split("x");
        
        for (String str : answer) {
            if (!str.equals("")) {
                myArr.add(str);
            }
        }
        answer = myArr.toArray(new String[0]);
        
        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = 0; j < answer.length - 1 - i; j++) {
                if (answer[j].compareTo(answer[j + 1]) > 0) {
                    String temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
            }
        }
        
        return answer;
    }
}