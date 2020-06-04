class Solution {
    public String reverseWords(String s) {
        char[] sc = s.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (int i = sc.length - 1; i >= 0;) {
            if (sc[i] == ' ') {
                int j = i;
                while (j >= 0 && sc[j] == ' ') {
                    j--;
                }
                sb.append(' ');
                i = j;
            } else {
                int j = i;
                while (j >= 0 && sc[j] != ' ') {
                    j--;
                }
                sb.append(s.substring(j+1, i+1));
                i = j;
            }
        }
        return (new String(sb)).trim();
    }
}