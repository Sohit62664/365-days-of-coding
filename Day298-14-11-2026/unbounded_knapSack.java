//Mimioization

class Solution {
    public int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n = val.length; 
        
        int dp[][] = new int[n][capacity+1];
        
        for(int [] x : dp){
            Arrays.fill(x , -1 );
        }
        return f(n-1 , capacity , val , wt , dp);
    }
    
    int f(int  i  , int capacity , int [] val , int[] wt ,int [][] dp){
        if( i < 0 ){
            return 0 ;
        }
        
        if(dp[i][capacity] != -1) return dp[i][capacity];
        int nt = f(i-1 , capacity , val , wt , dp);
        
        int take = Integer.MIN_VALUE;
        
        if(wt[i] <= capacity){
            take = val[i] + f(i , capacity- wt[i] , val , wt, dp );
        }
        return dp[i][capacity] =  Math.max(take , nt);
    }
}


//tabulation 
class Solution {
    public int knapSack(int val[], int wt[], int capacity) {
        // code here
        int n = val.length; 
        
        int dp[][] = new int[n][capacity+1];
        
        // for(int [] x : dp){
        //     Arrays.fill(x , -1 );
        // }
        
        
        for(int c= 0 ; c <= capacity ; c++){
            if(c >= wt[0]){
                dp[0][c] = val[0] * (c/wt[0]);
            }
        }
        
        for(int i = 1 ; i < n ; i++){
            for(int c = 1 ; c <= capacity ; c++){
                int nt = dp[i-1][c];
                
                int take = Integer.MIN_VALUE;
                
                if(c >= wt[i]){
                    take = val[i] + dp[i][c-wt[i]];
                }
                
                dp[i][c]= Math.max(take , nt);
            }
        }
        return dp[n-1][capacity];
        // return f(n-1 , capacity , val , wt , dp);
    }
    
    // int f(int  i  , int capacity , int [] val , int[] wt ,int [][] dp){
    //     if( i < 0 ){
    //         return 0 ;
    //     }
        
    //     if(dp[i][capacity] != -1) return dp[i][capacity];
    //     int nt = f(i-1 , capacity , val , wt , dp);
        
    //     int take = Integer.MIN_VALUE;
        
    //     if(wt[i] <= capacity){
    //         take = val[i] + f(i , capacity- wt[i] , val , wt, dp );
    //     }
    //     return dp[i][capacity] =  Math.max(take , nt);
    // }
}
