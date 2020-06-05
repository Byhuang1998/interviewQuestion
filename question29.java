class Solution {
    public int[] spiralOrder(int[][] matrix) {
        int row = matrix.length;
        if (row == 0) return new int[0];
        int col = matrix[0].length;
        boolean[][] visited = new boolean[row][col];
        int[] ii = {0, 1, 0, -1};
        int[] jj = {1, 0, -1, 0};
        int num = row * col;
        int index = 0;
        int[] res = new int[num];
        int i = 0, j = 0;
        int change = 0;
        int x = ii[change % 4];
        int y = jj[change % 4];
        while (index < num) {
            if (j < 0 || j == col || i == row || visited[i][j]) {
                change++;
                i -= x;
                j -= y;
                x = ii[change % 4];
                y = jj[change % 4];
            } else {
                res[index++] = matrix[i][j];
                visited[i][j] = true;
            }
            i += x;
            j += y;
        }
        return res;
    }
}