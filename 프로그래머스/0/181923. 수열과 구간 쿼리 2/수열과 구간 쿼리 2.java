import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int queryIdx = 0;
        
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            boolean flag = false;
            ArrayList<Integer> tempList = new ArrayList<>();
            
            
            for (int i = s; i <= e; i++) {
                if (k < arr[i]) {
                    tempList.add(arr[i]);
                    flag = true;
                }
            }
            // tempList to arr
            int[] arrToSort = tempList.stream().mapToInt(i -> i).toArray();
            
            // bubble sort asc
            for (int i = 0; i < arrToSort.length - 1; i++) {
                for (int j = 0; j <arrToSort.length - i - 1; j++) {
                    if (arrToSort[j] > arrToSort[j + 1]) {
                        int temp = arrToSort[j];
                        arrToSort[j] = arrToSort[j + 1];
                        arrToSort[j + 1] = temp;
                    }
                }
            }
            
            if (!flag) {
                // k보다 작은 값이 없을 때 
                answer[queryIdx++] = -1;
            } else {
                // k보다 작은 값이 있을 때
                // put the min val in answer
                answer[queryIdx++] = arrToSort[0];
            }
        }
        
        return answer;
    }
}