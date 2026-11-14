class Solution {
    public int cutRod(int[] price) {
        // code here
        int n = price.length;
        
        int dp[][] = new int [n][n+1];
        for(int [] x : dp){
            Arrays.fill(x , -1);
        }
        
        return f(n-1 ,0, price , dp);
    }
    
    int f(int i ,int l , int[] price , int [][] dp){
        if(i< 0){
            return 0;
        }
        
        if(dp[i][l]!= -1) return dp[i][l];
        
        int notcut = f(i-1 ,l+1 , price , dp );
        
        int cut = price[l] + f(i-1 , 0 , price , dp);
        
        return dp[i][l] = Math.max(notcut , cut);
    }
}



//Memoization 

class Solution {
    public int cutRod(int[] price) {
        // code here
        int n = price.length;
        
        int dp[][] = new int [n][n+1];
        for(int [] x : dp){
            Arrays.fill(x , -1);
        }
        
        return f(n-1 ,0, price , dp);
    }
    
    int f(int i ,int l , int[] price , int [][] dp){
        if(i< 0){
            return 0;
        }
        
        if(dp[i][l]!= -1) return dp[i][l];
        
        int notcut = f(i-1 ,l+1 , price , dp );
        
        int cut = price[l] + f(i-1 , 0 , price , dp);
        
        return dp[i][l] = Math.max(notcut , cut);
    }
}
