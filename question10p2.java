class Solution {
    public int numWays(int n) {
        if (n < 2) return 1;
        int a = 1, b = 1, sum = 0;
        for (int i = 2; i <= n; ++i) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }
}