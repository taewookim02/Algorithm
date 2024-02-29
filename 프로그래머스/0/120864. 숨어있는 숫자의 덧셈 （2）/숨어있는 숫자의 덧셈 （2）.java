class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        // split using regex
        String[] myArr = my_string.split("[a-zA-Z]+");
        for (int i = 0; i < myArr.length; i++) {
            if (!myArr[i].equals("")) {
                answer += Integer.parseInt(myArr[i]);    
            }
            
        }
        
        return answer;
    }
}