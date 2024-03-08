class Solution {
	public static void main(String[] args) {
		int[] myArr = {2,6,8,14};
		System.out.println(solution(myArr));
	}
	
    static public int solution(int[] arr) {
        int answer = 0;
        int setLcm = 0;
        
        // array iterate -> (lcm and arr[0]lcm) -> keep going
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {            	
            	setLcm = lcm(arr[i], arr[i + 1]);
            } else {
            	setLcm = lcm(setLcm, arr[i]);
            }
        }
        
        return answer = setLcm;
        
        
    }
    
    static private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
        
    }
    
    static private int lcm(int a, int b) {
        return (a * b / gcd(a, b));
    }
    
}