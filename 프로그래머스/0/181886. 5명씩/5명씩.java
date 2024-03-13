class Solution {
    public String[] solution(String[] names) {
        int myLen = (int) Math.ceil(names.length / 5.0);
        String[] answer = new String[myLen];
        
        for (int i = 0, j = 0; i < names.length; i += 5, j++) {
            answer[j] = names[i];
        }

        
        return answer;
    }
}