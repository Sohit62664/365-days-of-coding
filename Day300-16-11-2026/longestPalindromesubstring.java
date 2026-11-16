// A bit logical issues

class Solution {
    public String longestPalindrome(String s) {
        StringBuffer sb = new StringBuffer(s);
        int n = s.length();
        sb.reverse();
        String s1 = s;
        String s2 = sb.toString();

        int dp[][] = new int[n + 1][n + 1];
        int im = 0;
        int jm = 0;
        int max = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 0;
                }

                if (max < dp[i][j] && i + j - dp[i][j] == n) {
                    im = i;
                    max = dp[i][j];
                }

            }
        }
        StringBuffer ans = new StringBuffer();
        while (im > 0 && jm > 0) {
            if (s1.charAt(im - 1) == s2.charAt(jm - 1)) {
                ans.append(s1.charAt(im - 1));
            }
            im--;
            jm--;
        }

        return ans.toString();

    }
}



class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();

        String s1 = s;
        String s2 = new StringBuilder(s).reverse().toString();

        int[][] dp = new int[n + 1][n + 1];

        int im = 0;
        int max = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 0;
                }

                // Check whether the matching substring
                // represents a palindrome in the original string
                if (dp[i][j] > max && (i + j - dp[i][j] == n)) {
                    max = dp[i][j];
                    im = i;
                }
            }
        }

        return s.substring(im - max, im);
    }
}
