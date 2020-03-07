import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class question57p2 {
	    Queue<Integer> que;
	    Deque<Integer> deq;

	    public question57p2() {
	        que = new LinkedList<>();  //���У������ɾ��
	        deq = new LinkedList<>();  //˫�˶��У���ȡ���ֵ
	    }
	    
	    public int max_value() {
	        return deq.size()>0?deq.peek():-1;  //˫�˶��еĶ���Ϊque�����ֵ
	    }
	    
	    public void push_back(int value) {
	        que.offer(value);  //value���
	        while(deq.size()>0 && deq.peekLast()<value){
	            deq.pollLast();  //��deq��βС��value��Ԫ��ɾ��
	        }
	        deq.offerLast(value);  //��value����deq��β
	    }
	    
	    public int pop_front() {
	        int tmp = que.size()>0?que.poll():-1;  //��ö���Ԫ��
	        if(deq.size()>0 && tmp==deq.peek()){
	            deq.poll();  //������ӵ�Ԫ���ǵ�ǰ���ֵ����deq�Ķ��׳���
	        }
	        return tmp;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
