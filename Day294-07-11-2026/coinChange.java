class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int ans = f(n - 1, amount, coins);
        return ans!=Integer.MAX_VALUE ? ans : -1;
    }

    int f(int i, int target, int[] coins) {

        // base case
        if (i == 0) {
            int cnt = 0;
            while (target - coins[i] >= 0) {
                target -= coins[0];
                cnt++;
            }

            if (target == 0) {
                return cnt;
            } else {
                return Integer.MAX_VALUE;
            }
        }

        //base case in different way
        
        // if(i < 0){
        //     if(target == 0){
        //         return 0 ;
        //     }else{
        //         return Integer.MAX_VALUE;
        //     }
        // }


        if (target == 0)
            return 0;
        if (target < 0)
            return Integer.MAX_VALUE;
        int np = f(i - 1, target, coins);
        int pi = Integer.MAX_VALUE;

        if (target >= coins[i]) {
            
                int res = f(i, target - coins[i], coins);
                if(res!= Integer.MAX_VALUE) {
                    pi = 1+ res;
                }
            
        }

        return Math.min(np, pi);
    }
}




//Memoization 

class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        if(amount == 0) return 0 ;
        if(n == 1 && coins[0]> amount) return -1;
        int[][] dp = new int[n][amount+1];
        for(int[] x : dp){
            Arrays.fill(x, -1 );
        }

         f(n - 1, amount, coins , dp);
        int ans = dp[n-1][amount];

        return ans!=Integer.MAX_VALUE ? ans : -1;
    }


    int f(int i, int target, int[] coins , int [][] dp) {

        // base case
        // if (i == 0) {
        //     int cnt = 0;
        //     while (target - coins[i] >= 0) {
        //         target -= coins[0];
        //         cnt++;
        //     }

        //     if (target == 0) {
        //         return cnt;
        //     } else {
        //         return Integer.MAX_VALUE;
        //     }
        // }

        //base case in different way
        if(i < 0){
            if(target == 0){
                return 0 ;
            }else{
                return Integer.MAX_VALUE;
            }
        }

        if(dp[i][target]!= -1 ) return dp[i][target];



        if (target == 0)
            return 0;
        if (target < 0)
            return Integer.MAX_VALUE;
        int np = f(i - 1, target, coins , dp);
        int pi = Integer.MAX_VALUE;

        if (target >= coins[i]) {
            
                int res = f(i, target - coins[i], coins , dp);
                if(res!= Integer.MAX_VALUE) {
                    pi = 1+ res;
                }
            
        }

        return dp[i][target] = Math.min(np, pi);
    }
}
