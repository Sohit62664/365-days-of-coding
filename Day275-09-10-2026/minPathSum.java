// Tabulation method

class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int dp[][] = new int[m][n];

        for(int i =0 ; i< m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i ==0 && j ==0 ) {
                    dp[0][0] = grid[0][0];
                }else{
                    int up = Integer.MAX_VALUE;
                    int left = Integer.MAX_VALUE;

                    if(i>0){
                        up = grid[i][j]+ dp[i-1][j];
                    }

                    if(j> 0){
                        left = grid[i][j] + dp[i][j-1];
                    }

                    dp[i][j] = Math.min(up , left);
                }
            }
        }

        return dp[m-1][n-1];
    }
}



// Recursive Solution 
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        return f(m-1 , n-1 , grid);
      
    }

    int f(int i , int j , int[][] grid){
        if(i==0 && j==0){
            return grid[0][0];
        }

        if(i< 0 || j < 0 ){
            return Integer.MAX_VALUE;
        }

        int u= Integer.MAX_VALUE;
        int l= Integer.MAX_VALUE;


        if(i> 0){
            u = grid[i][j]+ f(i-1 , j , grid);
        }

        if(j>0){
            l = grid[i][j]+ f(i , j-1 , grid);
        }


        return Math.min(u , l);

    }
}


// memoization


class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int [][]dp =new int[m][n];

        for(int [] arr : dp){
            Arrays.fill(arr, -1);
        }
        return f(m-1 , n-1 , grid , dp);
      
    }

    int f(int i , int j , int[][] grid ,int [][] dp){
        if(i==0 && j==0){
            return grid[0][0];
        }

        if(i< 0 || j < 0 ){
            return Integer.MAX_VALUE;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int u= Integer.MAX_VALUE;
        int l= Integer.MAX_VALUE;


        if(i> 0){
            u = grid[i][j]+ f(i-1 , j , grid , dp );
        }

        if(j>0){
            l = grid[i][j]+ f(i , j-1 , grid , dp );
        }


        return dp[i][j] =  Math.min(u , l);

    }
}
