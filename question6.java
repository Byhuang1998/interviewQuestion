import java.util.Stack;
import java.util.Arrays;
public class question6 {

	class listnode {
		int val;
		listnode next;
		listnode(int x) {
			val = x;
		}
	}
	
	public int[] reversePrint(listnode head) {
		Stack<Integer> s = new Stack<>();
		listnode pointer = head;
		while (pointer != null) {
			s.push(pointer.val);
			if (pointer.next == null) break;
			pointer = pointer.next;
		}
		int size = s.size();
		int[] ans = new int[size];
		for (int i=0; i<size; ++i) {
			ans[i] = s.pop();
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question6 q = new question6();
		listnode head = q.new listnode(1);
		listnode first = head.next = q.new listnode(2);
		first.next = q.new listnode(3);
		
		
		int[] ans = q.reversePrint(head);
		System.out.println(Arrays.toString(ans));
	}

}
