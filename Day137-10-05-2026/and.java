class Solution {
    public long solve(long a, long b) {

        long limit = Math.max(a, b);
        long ans = Long.MAX_VALUE;

        for (long x = 1; x <= limit; x <<= 1) {

            long val = (a & x) + (b & x);

            ans = Math.min(ans, val);

            if (ans == 0) {
                return 0;
            }
        }

        return ans;
    }
}
