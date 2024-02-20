class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        // split
        // String[] myArr = str1.split(str2);
        // answer = myArr.length > 1 ? 1 : 2;
        
        // for 
        
        answer = str1.contains(str2) ? 1 : 2;        
        return answer;
    }
}