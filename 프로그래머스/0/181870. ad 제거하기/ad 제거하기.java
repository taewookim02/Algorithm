import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        ArrayList<String> myArr = new ArrayList<>();
        for (String val : strArr) {
            if (val.contains("ad")) {
                continue;
            }
            myArr.add(val);
        }
        
        answer = myArr.toArray(new String[0]);
        return answer;
    }
}