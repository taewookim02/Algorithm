class Solution {
    public String solution(String s) {
        String answer = "";
        char[] myArr = s.toCharArray();
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr.length - 1; j++) {
                if (myArr[j] < myArr[j + 1]) {
                    char temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }
        
        for (char val : myArr) {
            answer += val;
        }
        
        
        return answer;
    }
}