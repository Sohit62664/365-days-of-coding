class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;

        return count(n - 1, amount, coins);
    }

    int count(int i, int target, int[] coins) {
        if (i < 0) {
            if (target == 0)
                return 1;
            else {
                return 0;
            }
        }

        int not_take = count(i - 1, target, coins);
        int take = 0;
        if (coins[i] <= target) {
            take = count(i, target - coins[i], coins);
        }
        return not_take + take;
    }
}



// Memoization
class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp [][] = new int[n][amount+1];

        for(int [] x : dp){
            Arrays.fill(x , -1);
        }

        return count(n - 1, amount, coins , dp);
    }

    int count(int i, int target, int[] coins , int [][] dp) {
        if (i < 0) {
            if (target == 0)
                return 1;
            else {
                return 0;
            }
        }
        if(dp[i][target] != -1) return dp[i][target];
        int not_take = count(i - 1, target, coins , dp);
        int take = 0;
        if (coins[i] <= target) {
            take = count(i, target - coins[i], coins , dp);
        }
        return dp[i][target] =  not_take + take;
    }
}
