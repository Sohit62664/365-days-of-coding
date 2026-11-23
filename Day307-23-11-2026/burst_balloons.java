class Solution {
    public int maxCoins(int[] nums) {
        int n= nums.length;

        int nc[] = new int[n+2];
        nc[0]= 1;
        nc[n+1]= 1;

        for(int i = 1 ; i<= n ; i++){
            nc[i] = nums[i-1];
        }
        return f(1 , n , nc , 1 , 1  );
    }

    int f(int i , int j , int[] nums , int l , int r ){
        if(i > j) return 0 ;
        // if(i== j) return nums[i] * l * r ; 
        int coins = 0 ;
        for(int k = i ; k<= j ; k++){
           int coin = l * nums[k] * r;
            // int coin = nums[k-1] * nums[k] *  nums[k+1] ;
            
            coin+= f(i, k-1 , nums , l ,  nums[k] )+ f(k+1 , j , nums , nums[k] , r);

            coins= Math.max(coins , coin);
            
        }

        return coins;
    }
}



// using 4d dp --> memory limit exceed
class Solution {
    public int maxCoins(int[] nums) {
        int n= nums.length;

        int nc[] = new int[n+2];
        nc[0]= 1;
        nc[n+1]= 1;

        int max = 0 ;

        for(int i = 1 ; i<= n ; i++){
            nc[i] = nums[i-1];
            max = Math.max(max , nums[i-1]);
        }


        int dp[][][][] = new int[n+1][n+1][n+2][n+2];

        for( int [][][] x : dp){
            for(int [][] y : x){
                for(int []  z : y){
                    Arrays.fill(z , -1);
                }
            }
        }


        return f(1 , n , nc , 0 , n+1  , dp);
    }

    int f(int i , int j , int[] nums , int l , int r  , int [][][][] dp){
        if(i > j) return 0 ;
        // if(i== j) return nums[i] * l * r ; 
        int coins = 0 ;

        if(dp[i][j][l][r] != -1) return dp[i][j][l][r];
        for(int k = i ; k<= j ; k++){
           int coin = nums[l] * nums[k] * nums[r];
            // int coin = nums[k-1] * nums[k] *  nums[k+1] ;
            
            coin+= f(i, k-1 , nums , l ,  k , dp )+ f(k+1 , j , nums , k , r , dp);

            coins= Math.max(coins , coin);
            
        }

        return dp[i][j][l][r] = coins;
    }
}
