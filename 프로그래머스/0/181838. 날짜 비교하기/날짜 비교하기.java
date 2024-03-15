import java.time.LocalDate;
class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        LocalDate loDate1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate loDate2 = LocalDate.of(date2[0], date2[1], date2[2]);
        
        if (loDate1.isBefore(loDate2)) {
            answer = 1;
        }

        
        
        return answer;
    }
}