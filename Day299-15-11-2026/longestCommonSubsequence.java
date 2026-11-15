//recursive Solution 
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] s1 =  text1.toCharArray();
        char[] s2 =  text2.toCharArray();

        int n = s1.length;
        int m = s2.length;

        return f(n- 1 , m-1 , s1 ,s2);
    }

    int f(int i , int j , char [] s1 , char [] s2){
        if(i<0 || j < 0 ) return 0 ;

        if(s1[i] == s2[j]){
            return 1+ f(i-1 , j-1 , s1 , s2);
        }

        return Math.max(f(i-1 , j , s1 , s2) , f(i, j-1 , s1 , s2));
    }
}



//memoization

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] s1 =  text1.toCharArray();
        char[] s2 =  text2.toCharArray();

        int n = s1.length;
        int m = s2.length;

        int [][] dp = new int [n][m];
        for(int[] x : dp){
            Arrays.fill(x , -1); 
        }
        return f(n- 1 , m-1 , s1 ,s2 , dp);
    }

    int f(int i , int j , char [] s1 , char [] s2 , int [][] dp){
        if(i<0 || j < 0 ) return 0 ;

        if(dp[i][j]!= -1) return dp[i][j];

        if(s1[i] == s2[j]){
            return dp[i][j] = 1+ f(i-1 , j-1 , s1 , s2 , dp);
        }

        return dp[i][j] = Math.max(f(i-1 , j , s1 , s2 , dp) , f(i, j-1 , s1 , s2 , dp));
    }
}
