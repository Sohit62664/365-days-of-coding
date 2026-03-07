import java.util.Arrays;

class Solution {
    static int[][] dp;
    static int noOfWays(int m, int n, int x) {
        dp = new int[n + 1][x + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return ways(m, n, x);
    }

    static int ways(int faces, int dice, int sum) {
        if (sum == 0) return (dice == 0) ? 1 : 0;
        if (sum < 0 || dice == 0) return 0;
        if (dp[dice][sum] != -1) return dp[dice][sum];
        
        int ans = 0;
        for (int i = 1; i <= faces; i++) {
            ans += ways(faces, dice - 1, sum - i);
        }

        return dp[dice][sum] = ans;
    }
}
