class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        // split to arr
        String[] myArr = my_string.split("");
        
        // get strings
        String num1Str = myArr[num1], num2Str = myArr[num2];
        
        // use index to replace
        myArr[num2] = num1Str;
        myArr[num1] = num2Str;
        
        for (int i = 0; i < myArr.length; i++) {
            answer += myArr[i];
        }
        
        return answer;
    }
}