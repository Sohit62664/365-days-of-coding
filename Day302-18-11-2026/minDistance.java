class Solution {
    public int minDistance(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        return ff(w1 - 1, w2 - 1, word1, word2);
    }

    int ff(int i, int j, String s1, String s2) {
        if (i < 0) {
            // meaning i went through the String s1 nd but my length is 0 so i don't have much to match that's why i need to insert the remaing j elements
            return j + 1;

        }
        if (j < 0)
            return i + 1; // this much needs to delete becouse they are extra in s1

        if (s1.charAt(i) == s2.charAt(j)) { // already matched so no need the other operations
            return ff(i - 1, j - 1, s1, s2);
        }

        int delete = 1 + ff(i - 1, j, s1, s2); // let's delete the character and match with the remaiing one 
        int replace_it = 1 + ff(i - 1, j - 1, s1, s2); // replace the char i.e. it is got matched 
        int insert_it = 1 + ff(i, j - 1, s1, s2); // insert the character

        return Integer.min(delete, Math.min(replace_it, insert_it));
    }
}




// memoization 
class Solution {
    public int minDistance(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();

        int dp[][] = new int[w1][w2];
        for(int [] x : dp){
            Arrays.fill(x , -1);
        }
        return ff(w1 - 1, w2 - 1, word1, word2 , dp );
    }

    int ff(int i, int j, String s1, String s2 , int [][] dp) {

        if (i < 0) {
            return j + 1;
        }
        if (j < 0)
            return i + 1; 


        if(dp[i][j] != -1) return dp[i][j] ;
        if (s1.charAt(i) == s2.charAt(j)) { 
            return dp[i][j] = ff(i - 1, j - 1, s1, s2 , dp);
        }

        int delete = 1 + ff(i - 1, j, s1, s2 , dp );
        int replace_it = 1 + ff(i - 1, j - 1, s1, s2 , dp );
        int insert_it = 1 + ff(i, j - 1, s1, s2 , dp ); 
        return dp[i][j] = Integer.min(delete, Math.min(replace_it, insert_it));
    }
}


// Taabulation
class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int dp[][] = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = i ;
        }

        for (int j = 0; j <= m; j++) {
            dp[0][j] = j ;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // no opretion needed 
                } else {
                    int delete = 1 + dp[i - 1][j];
                    int replace_it = 1+ dp[i - 1][j - 1];
                    int insert_it = 1 + dp[i ][j -1];
                    dp[i][j] = Integer.min(delete, Math.min(replace_it, insert_it));
                }

            }
        }

        return dp[n][m];
    }

    int ff(int i, int j, String s1, String s2, int[][] dp) {

        if (i < 0) {
            return j + 1;
        }
        if (j < 0)
            return i + 1;

        if (dp[i][j] != -1)
            return dp[i][j];
        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = ff(i - 1, j - 1, s1, s2, dp);
        }

        int delete = 1 + ff(i - 1, j, s1, s2, dp);
        int replace_it = 1 + ff(i - 1, j - 1, s1, s2, dp);
        int insert_it = 1 + ff(i, j - 1, s1, s2, dp);
        return dp[i][j] = Integer.min(delete, Math.min(replace_it, insert_it));
    }
}
