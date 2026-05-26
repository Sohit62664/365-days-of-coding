class Solution {
    public int strStr(String haystack, String needle) {
        int[] lps = buildlps(needle);
        int i = 0;
        int j = 0;
        int n = haystack.length();
        while (i < n) {
            if (haystack.charAt(i) != needle.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            } else {
                i++;
                j++;
                if (j == needle.length()) {
                    return i - j;
                }
            }
        }
        return -1;
    }

    int[] buildlps(String pattern) {
        int n = pattern.length();
        int lps[] = new int[n];
        int len = 0;
        int i = 1;

        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}
