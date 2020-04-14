
public class question4 {

	public boolean findNumberIn2DArray(int[][] matrix, int target) {
		int row = matrix.length;
		if (row == 0) return false;
		int col = matrix[0].length;
		if (col == 0) return false;
		int r = row - 1;
		int c = 0;
		while (r>=0 && c<col) {
			if (matrix[r][c] < target) {
				c++;
			} else if (matrix[r][c] > target) {
				r--;
			} else {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
