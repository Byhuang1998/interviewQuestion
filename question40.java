import java.util.Arrays;

public class question40 {

	public int[] getLeastNumbers(int[] arr, int k) {
		int len = arr.length;
		
		// ÅÅĞò
		for (int i=0; i<len; ++i) {
			int cur = i;
			int tem = arr[i];
			for (int j=i; j<len; ++j) {
				if (arr[j] < tem) {
					cur = j;
					tem = arr[j];
				}
			}
			tem = arr[i];
			arr[i] = arr[cur];
			arr[cur] = tem;
		}
		System.out.println(Arrays.toString(arr));
		int[] ans = new int[k];
		for (int i=0; i<k; ++i) ans[i] = arr[i];
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,1};
		int k = 1;
		question40 q = new question40();
		System.out.println(Arrays.toString(q.getLeastNumbers(arr, k)));
	}

}
