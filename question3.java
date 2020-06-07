class Solution {
    public int findRepeatNumber(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        for (int nn : nums) {
            if (ans[nn] == 1) {
                return nn;
            }
            ans[nn] ++;
        }
        return -1;
    }
}