class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        // max is within sides 
        int max = sides[0] >= sides[1] ? sides[0] : sides[1];
        int sum = sides[0] + sides[1];
        
        
        for (int i = max; i < sum; i++) {
            answer++;
        }

        
        // max is outside sides
        while (max < sum) {
            answer++;
            max++;
        }    
        
        answer--;
            
        
        return answer;
    }
}