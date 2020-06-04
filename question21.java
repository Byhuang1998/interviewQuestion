class Solution {
    public int[] exchange(int[] nums) {
        int len = nums.length;
        int i = 0, j = len - 1; 
        for(; i < j; ++i, --j) {
            while (i < j && nums[i] % 2 == 1) {
                i++;
            }
            while (j > i && nums[j] % 2 == 0) {
                j--;
            }
            swap(nums, i ,j);
        }
        return nums;
    }
    private void swap(int[] nums, int i, int j) {
        int tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
    }
}