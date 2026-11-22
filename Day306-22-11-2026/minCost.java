//Recursion
class Solution {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int[] nc = new int[cuts.length+2];

        nc[0] = 0 ;
        nc[cuts.length +1] = n;

        for(int i = 1 ; i<= cuts.length ; i++){
            nc[i]= cuts[i-1];
        }
        return f( 1 , cuts.length , nc );
    }

    int f(int i , int j , int [] cuts ){
        if(i>j) return 0;

        int min = (int) 1e9;

        for(int k = i ; k <= j ; k++){
            int cost = cuts[j+1] - cuts[i-1] + f(i , k-1 , cuts) + f(k+1 , j , cuts);
            // System.out.println(cost);
             min = Math.min(min , cost);
        }

        return min ;
    }
}


//Memization
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


//Tabulation
class Solution {
    public int minCost(int n, int[] cuts) {

        Arrays.sort(cuts);
        int m = cuts.length;
        int[] nc = new int[m + 2];
        nc[0] = 0;
        nc[m + 1] = n;

        for (int i = 1; i <= m; i++) {
            nc[i] = cuts[i - 1];
        }
        int dp[][] = new int[m + 2][m + 2];

        for (int i = m; i >= 1; i--) {
            for (int j = i ; j <= m; j++) {
                int min = (int) 1e9 ;
                for (int k = i; k <= j; k++) {
                    int cost = nc[j + 1] - nc[i - 1] + dp[i][k - 1] + dp[k + 1][j];
                    min = Math.min(min, cost);
                }
                dp[i][j] = min;
            }
        }

        return dp[1][m];

        // return f(1, m, nc, dp);

    }

    int f(int i, int j, int[] cuts, int[][] dp) {
        if (i > j)
            return 0;
        int min = (int) 1e9;
        if (dp[i][j] != -1)
            return dp[i][j];
        for (int k = i; k <= j; k++) {
            int cost = cuts[j + 1] - cuts[i - 1] + f(i, k - 1, cuts, dp) + f(k + 1, j, cuts, dp);
            min = Math.min(min, cost);
        }

        return dp[i][j] = min;
    }

}
