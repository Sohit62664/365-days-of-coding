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
