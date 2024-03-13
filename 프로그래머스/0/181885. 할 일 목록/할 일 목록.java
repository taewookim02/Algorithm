import java.util.ArrayList;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        ArrayList<String> myArr = new ArrayList<String>();
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) 
                myArr.add(todo_list[i]);
        }
        
        answer = myArr.toArray(new String[0]);
        return answer;
    }
}