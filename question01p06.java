
public class question01p06 {
	public String compressString(String S) {
		int len = S.length();
		if (len==0 || len==1) return S;
		String ans = "";
		for (int i=0; i<len;) {
			char cur = S.charAt(i);
			int temNum = 0;
			for (int j=i; j<len; j++) {
				if (S.charAt(j)==cur) {
					temNum++;
				} else {
					ans = ans + cur + temNum;
					i = j;
					break;
				}
				if (j==len-1) {
					ans = ans + cur + temNum;
					i = len;
				}
			}
		}
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
