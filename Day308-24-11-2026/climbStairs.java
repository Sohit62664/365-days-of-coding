class Solution {
    public int climbStairs(int n) {
        int [] dp= new int[n+1];
        Arrays.fill(dp , -1) ;
        return f(0 , n , dp);
    }

    int f(int i , int n , int dp []){
        if(i==n){
            return 1;
        }else if(i >n){
            return 0 ;
        }
        if(dp[i] != -1) return dp[i];
        int one = f(i+1 , n , dp);
        int two = f(i+2 , n , dp );

        return dp[i]= one + two;
    }
}
