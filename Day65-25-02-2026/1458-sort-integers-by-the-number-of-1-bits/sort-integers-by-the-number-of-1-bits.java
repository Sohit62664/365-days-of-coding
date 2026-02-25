class Solution {
    
    // Helper function to count set bits
    int countBits(int x) {
        int cnt = 0;
        while (x > 0) {
            cnt += (x & 1);
            x >>= 1;
        }
        return cnt;
    }

    public int[] sortByBits(int[] arr) {
        int n = arr.length;

        // Brute force sorting
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                int bi = countBits(arr[i]);
                int bj = countBits(arr[j]);

                // Compare by bit count, then by value
                if (bi > bj || (bi == bj && arr[i] > arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}