class Solution {
    public int minSwaps(int[][] grid) {

        int n = grid.length;

        // Array to store number of trailing zeros in each row
        int[] needed = new int[n];

        // Step 1: Count trailing zeros for every row
        for (int i = 0; i < n; i++) {

            int zero = 0;

            // Start from the rightmost column and count zeros
            for (int j = n - 1; j >= 0; j--) {

                if (grid[i][j] == 0) {
                    zero++;           // increase count if element is zero
                } else {
                    break;            // stop when a 1 is found
                }
            }

            // store trailing zero count for this row
            needed[i] = zero;
        }

        int swap = 0;   // total number of swaps required

        // Step 2: Place rows in correct position
        for (int i = 0; i < n; i++) {

            // For row i we need at least (n - i - 1) trailing zeros
            int required = n - i - 1;

            int j = i;

            // Step 3: Find a row below that has enough trailing zeros
            while (j < n && needed[j] < required) {
                j++;
            }

            // If no such row exists, grid cannot be arranged
            if (j == n)
                return -1;

            // Step 4: Move the found row upward using adjacent swaps
            // (similar to bubble sort shifting)
            while (j > i) {

                // swap row j with row j-1
                int temp = needed[j];
                needed[j] = needed[j - 1];
                needed[j - 1] = temp;

                j--;        // move one position upward
                swap++;     // count the swap
            }
        }

        // return minimum number of swaps required
        return swap;
    }
}