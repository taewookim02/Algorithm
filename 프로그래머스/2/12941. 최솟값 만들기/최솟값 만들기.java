class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        // sort A asc
        quickSort(A, 0, A.length - 1, true);
        
        // sort B desc
        quickSort(B, 0, B.length - 1, false);
        
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }
    
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static int partition(int[] arr, int low, int high, boolean isAsc) {
        // get pivot
        int pivot = arr[high];
        
        // idx
        int i = low - 1;
        
        // for and check
        for (int j = low; j <= high; j++) {
            if (isAsc) {
                if (arr[j] < pivot) {
                    // ++
                    i++;
                    swap(arr, i, j);
                }    
            } else {
                if (arr[j] > pivot) {
                    // ++
                    i++;
                    swap(arr, i, j);
                }   
            }
            
        }
        
        // remainders
        swap(arr, i + 1, high);
        return i + 1;
    }
    
    static void quickSort(int[] arr, int low, int high, boolean isAsc) {
        if (low < high) {
            // get pi
            int pi = partition(arr, low, high, isAsc);
            
            // sort 2
            quickSort(arr, low, pi - 1, isAsc);
            quickSort(arr, pi + 1, high, isAsc);
        }
    }
}