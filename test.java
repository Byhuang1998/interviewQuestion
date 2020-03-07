import java.util.Arrays;
import java.util.Vector;
public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vector= new Vector<>();

        String[] s = new String[2];
        s = (String[]) vector.toArray(s);
        System.out.println(Arrays.toString(s));
        String[] s1 = new String[2];
        s1 = (String[]) vector.toArray(s);
        System.out.println(s == s1);
	}

}
