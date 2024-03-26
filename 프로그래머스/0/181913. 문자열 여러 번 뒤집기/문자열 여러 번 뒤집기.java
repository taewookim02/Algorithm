class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        for (int[] query : queries) {
            int s = query[0], e = query[1];
            String strLeft = my_string.substring(0, s);
            String strToReverse = my_string.substring(s, e + 1);
            String strRight = my_string.substring(e + 1);

            strToReverse = reverseStr(strToReverse);
            my_string = strLeft + strToReverse + strRight;            
        }

        return my_string;
    }
    
    private static String reverseStr(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseStr(str.substring(1)) + str.charAt(0);
    }
}