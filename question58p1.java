class Solution {
    public String reverseWords(String s) {
        // 匹配正则表达式
        String[] ans = s.split(" +");
        StringBuilder res = new StringBuilder("");
        for (int i = ans.length - 1; i >= 0; --i) {
            res.append(ans[i] + " ");
        }
        return new String(res).trim();
    }
}