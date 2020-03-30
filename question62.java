import java.util.ArrayList;
//import java.util.Arrays;
public class question62 {

	public int lastRemaining(int n, int m) {
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i=0; i<n; i++) {
			nums.add(i);
		}
		int pointer = 0;
		while (nums.size() != 1) {
			int len = nums.size();
			pointer = (m + pointer - 1) % len;
			nums.remove(pointer);
		}
		return nums.get(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question62 q = new question62();
		int ans = q.lastRemaining(88, 10);
		System.out.println(ans);
	}

}
