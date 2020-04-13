
public class question50 {

	public char firstUniqChar(String s) {
		char[] ss = s.toCharArray();
		char[] count = new char[128];
		for (char c : ss) {
			count[c] ++;
		}
		for (char c : ss) {
			if (count[c] == 1) return c;
		}
		return ' ';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
