class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length ; 
        return f(n-1 , W , 0 , val , wt);
    }
    
    int f(int i , int W , int value , int [] val , int [] wt){
        if(i < 0){
            return value ;
        }
        
        
        int np = f(i-1 , W, value , val , wt);
        int pi = 0 ;
        
        if(W- wt[i] >= 0){
            pi = f(i-1  , W- wt[i] , value + val[i] , val , wt);
        }
        
        return Math.max(np , pi);
    }
}

// in the m1 , While applying the memoization We carefull becouse the Valuse will be combined and we will use both the result at the Same Time


class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n =  val.length;
        
        return f(n-1 , W , val , wt);
    }
    
    int f(int i , int W , int[] val , int [] wt){
        if(i<0){
            return 0 ;
        }
        
        int np = 0+ f(i-1 , W , val , wt);
        
        int pi = Integer.MIN_VALUE;
        
        if(W-wt[i] >=0){
            pi = val[i] + f(i-1 , W-wt[i] , val , wt);
        }
        
        return Math.max(np , pi);
    }
}




// memoization 
    class Solution {
	public int knapsack(int W, int val[], int wt[]) {
		// code here
		int n = val.length ;
		
		int dp[][] = new int [n][W + 1];
		for (int [] row : dp) {
			Arrays.fill(row, -1);
		}
		
		return f(n - 1, W, val, wt, dp);
		
	}
	
	int f(int i, int W, int [] val, int [] wt, int [][] dp) {
		if (i == 0) { // we already treversed all
			
			if (W - wt[0] >= 0)
				return val[i] ;
			else return 0 ;
		}
		
		if (dp[i][W] != -1) {
			return dp[i][W];
		}
		
		int np = f(i - 1, W, val, wt, dp); // not pick
		int pi = Integer.MIN_VALUE ; // pick
		
		if (W - wt[i] >= 0) {
			pi = val[i] + f(i - 1, W - wt[i], val, wt, dp); // Can't do like this , Becouse dp and value both are using the same
		}
		
		dp[i][W] = Math.max(np, pi);
		return dp[i][W];
	}
}
