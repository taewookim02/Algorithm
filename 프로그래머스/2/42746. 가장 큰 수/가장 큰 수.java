class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        // int[] to string[]
        String[] arr = new String[numbers.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        
        // sort String arr
        sort(arr, 0, arr.length - 1);
        StringBuilder sb = new StringBuilder();
        for (String val : arr) {
            sb.append(val);
        }
        answer = sb.toString();
        if (answer.startsWith("0")) {
            answer = "0";
        }
        
        return answer;
    }
    
    private static void merge(String[] arr, int l, int m, int r) {
        // get sizes
        int n1 = m - l + 1;
        int n2 = r - m;
        
        // temp arr
        String[] L = new String[n1];
        String[] R = new String[n2];
        
        // put in data
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        
        // init idxes
        int i = 0, j = 0;
        int k = l;
        
        
        // while
        while (i < n1 && j < n2) {
            // if (L[i].compareTo(R[j]) > 0) {
            if ((L[i] + R[j]).compareTo(R[j] + L[i]) > 0) {
                // asc
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        // remainding
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    
    private static void sort(String[] arr, int l, int r) {
        if (l < r) {
            // get middle
            int m = l + (r - l) / 2;
            
            // sort 2 halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
            
            // merge 2 halves
            merge(arr, l, m, r);
        }
    }
}