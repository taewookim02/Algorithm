class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        // 1 +x +x
        // 2 -x +y
        // 3 -x -y
        // 4 +x -y
        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else {
            answer = 4;
        }
        
        return answer;
    }
}