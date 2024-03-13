class Solution {
    public String solution(String myString) {
        String answer = "";
        
        if (myString.contains("a")) {
            answer = myString.replace("a", "A");
        } 
        for (int i = 0; i < myString.length(); i++) {
            if (Character.isUpperCase(myString.charAt(i)) && myString.charAt(i) != 'A') {
                answer = myString.toLowerCase();
                answer = answer.replace("a", "A");
            }
        }
        
        return answer;
    }
}