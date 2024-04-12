import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int maximumPoke = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }
        if (set.size() > maximumPoke) {
            answer = maximumPoke;
        } else {
            answer = set.size();
        }
        System.out.println(set);
        // 가질 수 있는 폰켓몬 종류 수의 최댓값
        // 최대한 다양한 종류의 폰켓몬을 가지길 원
        return answer;
    }
}