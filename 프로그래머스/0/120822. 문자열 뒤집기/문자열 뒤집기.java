class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // split string into array
        String[] myArray = my_string.split("");
        
        
        // reverse array
        for (int i = myArray.length - 1; i >= 0; i--) {
            answer += myArray[i];
        }
        
        return answer;
    }
}