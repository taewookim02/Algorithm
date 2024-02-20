class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        //split string
        // arr[i].isNumber ? sum += arr[i] : continue;
        String[] myStrArr = my_string.split("");
        for (int i = 0; i < myStrArr.length; i++) {
            if (isInteger(myStrArr[i])) {
                answer += Integer.parseInt(myStrArr[i]);
            }
        }
        return answer;
    }
    
    public boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}