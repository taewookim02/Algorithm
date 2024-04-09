import java.util.TreeSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            ts.add(nums[i]);
        }

        int idx = 0;
        for (int val : ts) {
            nums[idx++] = val;
        }
            


        return ts.size();
    }
}