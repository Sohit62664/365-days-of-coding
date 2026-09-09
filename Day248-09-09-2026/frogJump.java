import java.util.Arrays;

class Solution {
    public int frogJump(int[] heights) {
        int n = heights.length;

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return frog(heights, dp, n - 1);
    }

    int frog(int[] heights, int[] dp, int n) {

        if (n == 0)
            return 0;

        if (dp[n] != -1)
            return dp[n];

        int left = frog(heights, dp, n - 1)
                + Math.abs(heights[n] - heights[n - 1]);

        int right = Integer.MAX_VALUE;

        if (n > 1) {
            right = frog(heights, dp, n - 2)
                    + Math.abs(heights[n] - heights[n - 2]);
        }

        return dp[n] = Math.min(left, right);
    }
}
