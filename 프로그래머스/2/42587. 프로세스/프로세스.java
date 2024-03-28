import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            queue.add(i);
        }
        
        while (!queue.isEmpty()) {
            int currIdx = queue.poll();
            boolean isMaxPrio = true;
            
            // chek if curridx is max
            for (int idx : queue) {
                if (priorities[currIdx] < priorities[idx]) {
                    isMaxPrio = false;
                    break; // cause no need to check
                }
            }
            
            if (isMaxPrio) {
                answer++;
                if (currIdx == location) {
                    return answer;
                }
            } else {
                queue.add(currIdx);
            }
            
            
        }
        
        return answer;
    }
}