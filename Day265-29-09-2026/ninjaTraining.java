import java.util.Arrays;

public class Solution {

    public static int ninjaTraining(int n, int points[][]) {

        int[][] dp = new int[n][4];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(points, n - 1, 3, dp);
    }

    static int helper(int[][] task, int day, int last, int[][] dp) {

        if (day == 0) {
            int max = 0;

            for (int i = 0; i < 3; i++) {
                if (i != last) {
                    max = Math.max(max, task[0][i]);
                }
            }

            return max;
        }

        if (dp[day][last] != -1) {
            return dp[day][last];
        }

        int maxp = 0;

        for (int i = 0; i < 3; i++) {

            if (i != last) {

                int current = task[day][i]
                        + helper(task, day - 1, i, dp);

                maxp = Math.max(maxp, current);
            }
        }

        return dp[day][last] = maxp;
    }
}
