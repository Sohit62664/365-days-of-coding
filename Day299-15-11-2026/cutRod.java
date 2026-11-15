class Solution {
    public int cutRod(int[] price) {
        // code here
        // Standard recursive solution 
        
        int n = price.length;
        return f(n-1 , n, price );
    }
    
    int f(int i ,int N , int[] price){
        // if(i == 0){
        //     return N * price[0];
        // }
        
        if(i < 0 ){
            return 0 ;
        }
        
        int nt = 0+ f(i-1 , N , price);
        int take = Integer.MIN_VALUE;
        
        int rod_length = i + 1;
        
        if(rod_length<= N){// rod length is lesser then required
            take = price[i] + f(i , N- rod_length , price);
        }
        
        return Math.max(nt , take);
    }
}





//Memoized Solution 
class Solution {
    public int cutRod(int[] price) {
        // code here
        // Standard recursive solution 
        
        int n = price.length;
        
        int dp[][] = new int[n][n+1];
        for(int [] x : dp){
            Arrays.fill(x , -1);
        }
        return f(n-1 , n, price  , dp );
    }
    
    int f(int i ,int N , int[] price , int[][] dp){
        // if(i == 0){
        //     return N * price[0];
        // }
        
        if(i < 0 ){
            return 0 ;
        }
        if(dp[i][N]!= -1) return dp[i][N];
        int nt = 0+ f(i-1 , N , price , dp );
        int take = Integer.MIN_VALUE;
        
        int rod_length = i + 1;
        
        if(rod_length<= N){// rod length is lesser then required
            take = price[i] + f(i , N- rod_length , price , dp);
        }
        
        return dp[i][N]= Math.max(nt , take);
    }
}
