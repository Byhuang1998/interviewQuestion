import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class question56 {
    public int[] singleNumbers(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<len; i++) {
            if (!map.containsKey(nums[i])) {
            	map.put(nums[i], 1);
            } else {
            	map.put(nums[i], 2);
            }
        }
        int[] pos = new int[2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	if (i==1 && entry.getValue() == 1) {
        		pos[i] = entry.getKey();
        		break;
        	}
        	if (i==0 && entry.getValue() == 1) {
        		pos[i] = entry.getKey();
        		i ++;
        	}
        }
        return pos;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question56 q = new question56();
		int[] nums = {1,2,10,4,1,4,3,3};
		int[] ans = q.singleNumbers(nums);
		System.out.println(Arrays.toString(ans));
	}

}
