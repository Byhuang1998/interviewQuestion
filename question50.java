import java.util.HashMap;
import java.util.Map;
public class question50 {

	public char firstUniqChar(String s) {
		Map<Character, Boolean> map = new HashMap<>();
		char[] ss = s.toCharArray();
		for (char c : ss) map.put(c, !map.containsKey(c));
		for (char c : ss) {
			if (map.get(c) == true) return c;
		}
		return ' ';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
