class Solution {
    int[] ans = new int[101];
    public int numWays(int n) {
        ans[0] = ans[1] = 1;
        ans[2] = 2;
        for (int i = 3; i < 101; ++i) {
            ans[i] = (ans[i-1] + ans[i-2]) % 1000000007;
        }
        return ans[n];
    }
}