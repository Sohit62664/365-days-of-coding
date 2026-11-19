class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();

        boolean dp[][] = new boolean[n+1][m+1];

        dp[0][0] = true;

        for (int j = 1; j <=m ; j++) {
            if (p.charAt(j-1) == '*')
                dp[0][j] = dp[0][j-1];
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i-1) == p.charAt(j-1)) {
                     dp[i][j] =  dp[i-1][j-1];
                } else if (p.charAt(j-1) == '?') {
                     dp[i][j] = dp[i-1][j-1];
                } else if (p.charAt(j-1) == '*') {
                    boolean nostar =  dp[i][j-1];
                    boolean star = dp[i-1][j];

                     dp[i][j] = (nostar || star);
                } else {
                     dp[i][j] = false;
                }
            }
        }

        return dp[n][m];

        // return f(n - 1, m - 1, s, p, dp);
    }

    boolean f(int i, int j, String s, String p, Boolean[][] dp) {
        if (i < 0) {
            if (j < 0)
                return true;
            return false;
        }

        // if my p is finished this mence nothing i can compaere so i need to check wether the remaining i in s is stars if they are that mence we scessfully matched so true else false 

        if (j < 0) {
            for (int k = 0; k <= i; k++) {
                if (s.charAt(k) != '*')
                    return false;
            }
            return true;
        }

        if (dp[i][j] != null)
            return dp[i][j];
        // recurrance 
        if (s.charAt(i) == p.charAt(j)) {
            return dp[i][j] = f(i - 1, j - 1, s, p, dp);
        } else if (s.charAt(i) == '?') {
            return dp[i][j] = f(i - 1, j - 1, s, p, dp);
        } else if (s.charAt(i) == '*') {
            boolean nostar = f(i - 1, j, s, p, dp);
            boolean star = f(i, j - 1, s, p, dp);

            return dp[i][j] = (nostar || star);
        } else {
            return dp[i][j] = false;
        }
    }

}
