import java.util.Arrays;

public class question56 {
    public int[] singleNumbers(int[] nums) {
    	int ret = 0;
    	for (int num : nums) {
    		ret ^= num;
    	}
    	int h = ret & (-ret);
    	
    	int a = 0;
    	for (int num : nums) {
    		if ((num & h) == 0) {
    			a ^= num;
    		}
    	}
    	return new int[] {a, a^ret};
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question56 q = new question56();
		int[] nums = {1,2,10,4,1,4,3,3};
		int[] ans = q.singleNumbers(nums);
		System.out.println(Arrays.toString(ans));
	}

}
