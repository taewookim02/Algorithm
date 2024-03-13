import java.util.LinkedList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};

        // LinkedList
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        
        for (int val : arr) {
            myLinkedList.add(val);
        }
        
        
        for (int val : delete_list) {
            myLinkedList.remove(Integer.valueOf(val));
        }
    
        answer = myLinkedList.stream().mapToInt(i -> i).toArray();
        
        
        // ArrayList
        
        return answer;
    }
}