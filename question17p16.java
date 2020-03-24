
public class question17p16 {

	   public int massage(int[] nums) {
	        int len = nums.length;
	        if (len == 0) {
	            return 0;
	        }
	        if (len == 1) {
	            return nums[0];
	        }

	        // dp[i][0]������ [0, i] �����ԤԼ���󣬲����±�Ϊ i ����һ�첻����ԤԼ�����ʱ��
	        // dp[i][1]������ [0, i] �����ԤԼ���󣬲����±�Ϊ i ����һ�����ԤԼ�����ʱ��
	        int[][] dp = new int[len][2];
	        dp[0][0] = 0;
	        dp[0][1] = nums[0];

	        for (int i = 1; i < len; i++) {
	            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
	            dp[i][1] = dp[i - 1][0] + nums[i];
	        }
	        return Math.max(dp[len - 1][0], dp[len - 1][1]);
	    }

	   public static void main(String[] args) {
		   question17p16 q = new question17p16();
	        // int[] nums = {1, 2, 3, 1};
	        // int[] nums = {2, 7, 9, 3, 1};
	        int[] nums = {2, 1, 4, 5, 3, 1, 1, 3};
	        int res = q.massage(nums);
	        System.out.println(res);
	    }
}

 

 