import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;


class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> daysToComplete = new LinkedList<>();
        ArrayList<Integer> deploymentCounts = new ArrayList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int days = (int) Math.ceil((100.0 - progresses[i])/speeds[i]);
            daysToComplete.offer(days);
        }
        
        while (!daysToComplete.isEmpty()) {
            int deployDay = daysToComplete.poll(); // Day the current task will be completed
            int count = 1; // At least the current task will be deployed
            
            while (!daysToComplete.isEmpty() && daysToComplete.peek() <= deployDay) {
                daysToComplete.poll();
                count++;
            }
            
            deploymentCounts.add(count);
        }

        System.out.println(daysToComplete);
        System.out.println(deploymentCounts);
        answer = deploymentCounts.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}