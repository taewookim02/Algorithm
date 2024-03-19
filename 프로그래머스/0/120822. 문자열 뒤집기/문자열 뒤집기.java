class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        answer = myFunc(my_string);
            
        return answer;
    }
    
    public static String myFunc(String myStr) {
        if (myStr.length() == 0) {
            return myStr;
        }
        return myFunc(myStr.substring(1)) + myStr.charAt(0);
    }
}