class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();

        // sort charArr
        for (int i = 0; i < charArr.length - 1; i++) {
            for (int j = 0; j < charArr.length - 1 - i; j++) {
                if (charArr[j] > charArr[j + 1]) {
                    char temp = charArr[j + 1];
                    charArr[j + 1] = charArr[j];
                    charArr[j] = temp;
                }
            }
        }
        
        // concatenate answer with chars that doesn't have 
        for (int i = 0; i < charArr.length; i++) {
            
            if ((i == 0 || charArr[i] != charArr[i - 1]) && (i == charArr.length - 1 || charArr[i] != charArr[i + 1])) {
                answer += charArr[i];                
            }

        }
        
        
        
        
        
        return answer;
    }
}