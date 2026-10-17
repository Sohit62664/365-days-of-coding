class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length ;
        int dp[][] = new int[n][n];

        for(int j =0 ; j< n ; j++){
            dp[0][j] = matrix[0][j];
        }


        for(int i= 1 ; i< n ; i++){
            for(int j =0 ; j< n ; j++){
                int u = matrix[i][j] + dp[i-1][j];
                int ld = Integer.MAX_VALUE;
                int rd = Integer.MAX_VALUE;

                if(j > 0){
                    ld = matrix[i][j] + dp[i-1][j-1];
                }

                if(j+1 < n){
                    rd = matrix[i][j] + dp[i-1][j+1];
                }

                dp[i][j] = Math.min(u , Math.min(ld , rd));
            }
        }

        int min = dp[n-1][0];

        for(int j = 1 ; j < n ; j++){
            min = Math.min(min , dp[n-1][j]);
        }
        return min ;
    }
}
