class Solution {
    public int dominantPairs(int[] arr) {
        int n = arr.length;
        int mid = n / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, n);

        Arrays.sort(left);
        Arrays.sort(right);

        int j = 0;
        int count = 0;

        for (int i = 0; i < mid; i++) {
            while (j < mid && left[i] >= 5L * right[j]) {
                j++;
            }

            count += j;
        }

        return count;
    }
}
