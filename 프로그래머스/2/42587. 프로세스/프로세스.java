import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(i);
        }
        int answer = 0;
        
        while (true) {
            int currIndex = queue.poll();
            boolean isMaxPrio = true;
            
            for (int idx : queue) {
                if (priorities[idx] > priorities[currIndex]) {
                    isMaxPrio = false;
                    break;
                }
            }
            
            if (isMaxPrio) {
                answer++;
                if (currIndex == location) {
                    return answer;
                }
            } else {
                queue.add(currIndex);
            }
        }
        
    }
}