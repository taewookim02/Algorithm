class Solution {
    public int solution(String[] order) {
        int answer = 0;
        // 아메리카노와 카페 라테의 가격은 차가운 것과 
        // 뜨거운 것 상관없이 각각 4500, 5000원입니다
        for (String str : order) {
            if (str.contains("americano") || str.contains("anything")) {
                answer += 4500;
            } else if (str.contains("cafelatte")) {
                answer += 5000;
            }
        }
        return answer;
    }
}