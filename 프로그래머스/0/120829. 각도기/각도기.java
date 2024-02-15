class Solution {
    public int solution(int angle) {
        /*
        1 == 0 < 90 예각
        2 == 90 직각
        3 == < 180 둔각
        4 == 180 평각
        */
        int answer = 0;

        if (angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle < 180) {
            answer = 3;
        } else {
            answer = 4;
        }
        return answer;
    }
}