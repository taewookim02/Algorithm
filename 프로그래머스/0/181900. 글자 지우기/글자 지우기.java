import java.util.LinkedList;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        LinkedList<String> myList = new LinkedList<>();
        
        for (char myChar : my_string.toCharArray()) {
            myList.add(myChar + "");
        }

        // sort desc
        for (int i = 0; i < indices.length - 1; i++) {
            for (int j = 0; j < indices.length - 1 - i; j++) {
                if (indices[j] < indices[j + 1]) {
                    int temp = indices[j];
                    indices[j] = indices[j + 1];
                    indices[j + 1] = temp;
                }
            }
        }
        
        
        // remove chars
        for (int i = 0; i < indices.length; i++) {
            myList.remove(indices[i]);
            
        }
        
        for (String str : myList) {
            answer += str;
        }

        return answer;
    }
}