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
