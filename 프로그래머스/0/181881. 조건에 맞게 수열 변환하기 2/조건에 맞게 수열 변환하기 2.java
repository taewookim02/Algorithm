// import java.util.Arrays;

// class Solution {
//     public int solution(int[] arr) {
        
//         int answer = 0;
//         int[] tempArr = Arrays.copyOf(arr, arr.length);
//         Arrays.equals(arr, tempArr);
        
        
//         while (true) {
//             for(int i = 0; i < arr.length; i++) {
//                 if (arr[i] >= 50 && arr[i] % 2 == 0) {
//                     arr[i] /= 2;
//                 } else if (arr[i] < 50 && arr[i] % 2 == 1) {
//                     arr[i] *= 2 + 1;
//                 }
//             }    
//             answer++;
            
//             if (Arrays.equals(arr, tempArr)) {
//                 break;
//             }
//             tempArr = Arrays.copyOf(arr, arr.length);
//         }
        
        
//         return answer;
//     }
// }
import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        while (true) {
            // 변경 전 상태를 저장
            int[] tempArr = Arrays.copyOf(arr, arr.length);

            for(int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1; // 올바른 계산식으로 수정
                }
            }

            // 변경 후 상태가 변경 전과 같다면 반복 종료
            if (Arrays.equals(arr, tempArr)) {
                break;
            }
            
            answer++;
        }

        return answer;
    }
}
