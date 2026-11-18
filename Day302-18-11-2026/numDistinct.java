class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();

        return f(n-1 , m-1 , s , t);
    }

    int f(int i , int j , String s1 , String s2){
        if(i < 0 ){
            return (j<0) ? 1 : 0 ;
        }
        if(j<0) return 1 ;

        //not matched

        if(s1.charAt(i)!= s2.charAt(j)){
            return f(i-1 , j , s1 , s2);
        }else{
            return f(i-1 , j-1 , s1 , s2) + f(i-1 , j , s1 , s2);
        }


    }
}




//memoization 
class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int dp[][] = new int[n+1][m+1];

        for(int[] x : dp){
            Arrays.fill(x , -1);
        }
        return f(n-1 , m-1 , s , t , dp );
    }

    int f(int i , int j , String s1 , String s2 , int dp[][]){
        if(i < 0 ){
            return (j<0) ? 1 : 0 ;
        }
        if(j<0) return 1 ;

        if(dp[i][j] != -1) return dp[i][j];
        //not matched

        if(s1.charAt(i)!= s2.charAt(j)){
            return dp[i][j] = f(i-1 , j , s1 , s2, dp);
        }else{
            return dp[i][j] = f(i-1 , j-1 , s1 , s2 , dp) + f(i-1 , j , s1 , s2 , dp);
        }


    }
}
