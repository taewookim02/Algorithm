class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String revStr = "";
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                revStr += 'B';
            } else {
                revStr += 'A';
            }
        }
        
        answer = revStr.contains(pat) ? 1 : 0;

        return answer;
    }
}