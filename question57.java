import java.util.Vector;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class question57 {

	public int[][] findContinuousSequence(int target) {
		        
		        List<int[]> result = new ArrayList<>();
		        int i = 1;

		        while(target>0)
		        {
		            target -= i++;
		            if(target>0 && target%i == 0)
		            {
		                int[] array = new int[i];
		                for(int k = target/i, j = 0; k < target/i+i; k++,j++)
		                {
		                    array[j] = k;
		                }
		                result.add(array);
		            }
		        }
		        Collections.reverse(result);
		        return result.toArray(new int[0][]);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question57 q = new question57();
		int[][] res = q.findContinuousSequence(15);
		int i = res.length;
		if (i == 0) return;
		for (int m=0; m<i; m++) {
			int j = res[m].length;
			for (int n=0; n<j; n++) {
				System.out.print(res[m][n]);
			}
			System.out.println();
		}
	}

}
