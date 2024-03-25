class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String a = my_string.substring(0, s);
        String b = my_string.substring(s, e + 1);
        b = recursiveReverseString(b);        
        String c = my_string.substring(e + 1);
        answer = a + b + c;
        return answer;
    }
    
    
    private static String recursiveReverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return recursiveReverseString(str.substring(1)) + str.charAt(0);
    }
}