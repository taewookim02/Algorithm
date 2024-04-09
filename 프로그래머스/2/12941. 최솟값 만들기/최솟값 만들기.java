class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        // sort A asc
        sort(A, 0, A.length - 1, true);
        
        // sort B asc
        sort(B, 0, B.length - 1, false);
    
        // answer +=
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }
    
    private static void merge(int[] arr, int l, int m, int r, boolean isAsc) {
        // get sizes
        int n1 = m - l + 1;
        int n2 = r - m;
        
        // temp arr
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        // put in data
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        
        // init idx
        int i = 0, j = 0;
        int k = l;
        
        
        // while (isAsc or desc)
        if (isAsc) {
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
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
        } else {
            while (i < n1 && j < n2) {
                if (L[i] >= R[j]) {
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
        
        
    }
    
    private static void sort(int[] arr, int l, int r, boolean isAsc) {
        if (l < r) {
            // get middle
            int m = l + (r - l) / 2;
            
            // sort 2 halves
            sort(arr, l, m, isAsc);
            sort(arr, m + 1, r, isAsc);
            
            merge(arr, l, m, r, isAsc);
        }
    }
    
}