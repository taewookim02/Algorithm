class Solution {
    public String solution(int[] food) {
        String answer = "";
        for (int i = 1; i < food.length; i++) {
            int availableFood = food[i] / 2;
            for (int j = 0; j < availableFood; j++) {
                answer += i;
            }
        }
        
        String revStr = "";
        for (int i = answer.length() - 1; i >= 0; i--) {
            revStr += answer.charAt(i);
        }

        answer = answer + "0" + revStr;
        return answer;
    }
}