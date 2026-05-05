class Solution {
    public long sumXOR(int[] arr) {
        int n = arr.length;
        long total = 0;

        for (int k = 0; k < 32; k++) {
            long cnt1 = 0;

            for (int num : arr) {
                if ((num & (1 << k)) != 0) {
                    cnt1++;
                }
            }

            long cnt0 = n - cnt1;
            total += cnt1 * cnt0 * (1L << k);
        }

        return total;
    }
}
