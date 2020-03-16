
public class question01p06 {
	public String compressString(String S) {
		int len = S.length();
		if (len==0 || len==1) return S;
		String ans = "";
		char cur = S.charAt(0);
		int count = 1;
		for (int i=1; i<len; ++i) {
			if (S.charAt(i)==cur) count++;
			else {
				ans = ans + cur + count;
				count = 1;
				cur = S.charAt(i);
			}
		}
		ans = ans + cur + count;
		int nlen = ans.length();
		ans = nlen<len ? ans : S;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question01p06 q = new question01p06();
		String S = "aabcccccaaa";
		String ans = q.compressString(S);
		System.out.println(ans);
	}

}
