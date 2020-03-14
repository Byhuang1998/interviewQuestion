
public class test {
	
	public int maxSubArray(int[] nums) {
		int max = Integer.MIN_VALUE;
		int len = nums.length;
		if (len == 1) return nums[0];
		for (int i=0; i<len; i++) {
			int sum = 0;
			for (int j=i; j<len; j++) {
				sum += nums[j];
				if (sum>max) max = sum;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new test();
		int[] nums = {1,2,3,5,4,-1,-5,7};
		int ans = t.maxSubArray(nums);
		System.out.println(ans);
	}

}
