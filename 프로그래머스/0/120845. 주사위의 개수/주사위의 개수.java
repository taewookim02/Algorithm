class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        // 가로, 세로, 높이
        answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        // 넓이부터 구하지 마시고 가로 세로 높이를 모서리 만큼 나눈다음 가로*세로*높이 해주시면 됩니다
        return answer;
    }
}