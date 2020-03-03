
public class question10p01 {
	
	public void merge(int[] A, int m, int[] B, int n) {
		int[] res = new int[m+n];
		int p1=0;
		int p2=0;
		for (int i=0; i<m+n; i++) {
			if (p1==m) {
				res[i] = B[p2];
				p2++;
				continue;
			}
			if (p2==n) {
				res[i] = A[p1];
				p1++;
				continue;
			}
			if (A[p1]<B[p2]) {
				res[i] = A[p1];
				p1++;
				continue;
			}
			if (A[p1] >= B[p2]) {
				res[i] = B[p2];
				p2++;
				continue;
			}
		}
		for (int i=0; i<m+n; i++) {
			A[i] = res[i];
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,0,0,0};
		int m = 3;
		int[] B = {2,5,6};
		int n = 3;
		question10p01 q = new question10p01();
		q.merge(A, m, B, n);
		for(int i=0; i<m+n; i++) {
			System.out.println(A[i]);
		}
	}

}
