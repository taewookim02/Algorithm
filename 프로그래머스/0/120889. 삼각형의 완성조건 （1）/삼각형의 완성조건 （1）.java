class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        for (int i = 0; i < sides.length;i++) {
            for (int j = 0; j < sides.length - 1 - i; j++) {
                if (sides[j] > sides[j + 1]) {
                    int temp = sides[j];
                    sides[j] = sides[j + 1];
                    sides[j + 1] = temp;
                }
            }
        } 
        // if (sides[0] + sides[1] <= sides[2]) {
        //     answer = 2
        // } 
        answer = sides[0] + sides[1] <= sides[2] ? 2 : 1;
        return answer;
    }
}