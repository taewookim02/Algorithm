import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> que = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            que.offer(i);
        }
        
        while (!que.isEmpty()) {
            int curIdx = que.poll();
            boolean isMaxPrio = true;
            for (int idx : que) {
                if (priorities[curIdx] < priorities[idx]) {
                    isMaxPrio = false;
                    break;
                }
            }
            
            if (isMaxPrio) {
                answer++;
                if (curIdx == location) {
                    return answer;
                }
            } else {
                que.offer(curIdx);
            }
            
        }
        
        return answer;
    }
}