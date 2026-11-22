class Solution {
    public int minCost(int n, int[] cuts) {

        Arrays.sort(cuts);
        int m = cuts.length;

        int dp[][] = new int[m+1][m+1] ;
        for(int x [] : dp){
            Arrays.fill(x , -1 );
        }

        int [] nc = new int[m+2];
        nc[0] = 0 ;
        nc[m+1] = n ;

        for(int i= 1 ; i <= m ; i++ ){
        nc[i] = cuts[i-1];
        }
        return f(1 , m  , nc , dp );
        
    }

    int f( int i , int j , int [] cuts,  int [][]dp){
        if(i > j) return 0 ; 
        int min = (int) 1e9 ;
        if(dp[i][j]!= -1 ) return dp[i][j] ;
        for(int k = i ; k <= j ; k++){
            int cost = cuts[j+1]- cuts[i-1] + f(i , k-1  , cuts , dp) + f(k+1 , j , cuts , dp) ;
            min = Math.min(min , cost) ;
        }

        return dp[i][j] = min ;
    }
    
}
