import java.util.HashSet;
import java.util.Set;


class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        sort(phone_book, 0, phone_book.length - 1);
        Set<String> seenNumbers = new HashSet<>();
        
        for (String number : phone_book) {
            // check if any prefix of curr num is already seen
            StringBuilder prefix = new StringBuilder();
            for (char digit : number.toCharArray()) {
                prefix.append(digit);
                if (seenNumbers.contains(prefix.toString())) {
                    return false;
                }
            }
            // add the curr num to set
            seenNumbers.add(number);
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
            if (L[i].compareTo(R[j]) < 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        // remainders
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
            sort(arr, l , m);
            sort(arr, m + 1, r);
            
            // merge 2 halves
            merge(arr, l, m, r);
        }
    }
}