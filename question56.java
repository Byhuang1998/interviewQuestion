import java.util.Arrays;

public class question56 {
    public int[] singleNumbers(int[] nums) {
    	int ret = 0;
    	for (int num : nums) {
    		ret ^= num;
    	}
    	int h = 1;
    	while ((ret & h) == 0) {
    		h <<= 1;
    	}
    	
    	int a = 0;
    	int b = 0;
    	for (int num : nums) {
    		if ((num & h) == 0) {
    			a ^= num;
    		} else {
    			b ^= num;
    		}
    	}
    	return new int[] {a, b};
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question56 q = new question56();
		int[] nums = {1,2,10,4,1,4,3,3};
		int[] ans = q.singleNumbers(nums);
		System.out.println(Arrays.toString(ans));
	}

}
