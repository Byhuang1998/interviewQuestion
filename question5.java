public class question5 {

	public String replaceSpace(String s) {
		int len = 3 * s.length();
		char[] sc = new char[len];
		char[] ss = s.toCharArray();
		int size = 0;
		for (char c : ss) {
			if (c == ' ') {
				sc[size++] = '%';
				sc[size++] = '2';
				sc[size++] = '0';
			} else {
				sc[size++] = c;
			}
		}
		return new String(sc, 0, size);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
