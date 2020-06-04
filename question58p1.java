class Solution {
    public String reverseWords(String s) {
        String[] ans = s.split(" ");
        StringBuilder res = new StringBuilder("");
        for (int i = ans.length - 1; i >= 0; --i) {
            if (ans[i].equals("")) continue;
            res.append(ans[i] + " ");
        }
        return new String(res).trim();
    }
}