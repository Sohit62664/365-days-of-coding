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



// Tabulation
class Solution {
	public int cutRod(int[] price) {
		int n = price.length;
		
		int dp[][] = new int[n][n + 1];
		
		// base case
		for (int i = 0 ; i <= n ; i++) {
			dp[0][i] = i*price[0];
		}
		
		// nested loops
		for (int i = 1 ; i<n ; i++) {
			for (int N = 0 ; N <= n ; N++) {
				int nt = 0 + dp[i - 1][N];
				int take = Integer.MIN_VALUE;
				
				int rd = i + 1 ;
				if (rd <= N) {
					take = price[i] + dp[i][N - rd];
				}
				
				dp[i][N] = Math.max(nt, take);
			}
		}
		return dp[n - 1][n];
	}
	
}
