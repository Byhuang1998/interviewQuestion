import java.util.HashMap;
import java.util.Map;
public class question50 {

	public char firstUniqChar(String s) {
		Map<Character, Integer> map = new HashMap<>();
		char[] ss = s.toCharArray();
		for (char c : ss) {
			if (! map.containsKey(c)) map.put(c, 1);
			else map.put(c, map.get(c) + 1);
		} 
		for (char c : ss) {
			if (map.get(c) == 1) return c;
		}
		return ' ';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
