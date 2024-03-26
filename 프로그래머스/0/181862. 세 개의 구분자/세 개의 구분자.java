import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        String[] myArr = myStr.split("[abc]+");
        ArrayList<String> myList = new ArrayList<>();     
        
        if (myArr.length == 0) {
            myList.add("EMPTY");
        } else {
            for (int i = 0; i < myArr.length; i++) {
                if (!myArr[i].equals("")) {
                    myList.add(myArr[i]);
                }
            }
        }
        
        answer = myList.toArray(new String[0]);
        
        
        return answer;
    }
}