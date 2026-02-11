import java.util.Arrays;

class Solution {
    // Segment Tree components to store range min/max and lazy updates
    private int[] minTree;
    private int[] maxTree;
    private int[] lazy;
    private int n;

    public int longestBalanced(int[] nums) {
        n = nums.length;
        // Allocate size 4*n for the segment tree to handle worst-case splits
        minTree = new int[4 * n];
        maxTree = new int[4 * n];
        lazy = new int[4 * n];

        // Map to store the last seen position of each number.
        // Constraints say nums[i] <= 10^5, so an array is efficient.
        int[] lastPos = new int[100001];
        Arrays.fill(lastPos, -1);

        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int val = nums[i];
            int prev = lastPos[val];

            // Logic: Odd numbers contribute +1, Even numbers contribute -1.
            // We want the net sum in a range to be 0.
            int change = (val % 2 != 0) ? 1 : -1;

            // Update the range [prev + 1, i]. 
            // This range represents all start indices 'L' for which the current number 'val'
            // is a new distinct number in the subarray nums[L...i].
            update(1, 0, n - 1, prev + 1, i, change);

            // Find the leftmost index L in [0, i] where the segment tree value is 0.
            int leftIndex = findFirstZero(1, 0, n - 1, i);

            if (leftIndex != -1) {
                // If found, update the maximum length
                maxLen = Math.max(maxLen, i - leftIndex + 1);
            }

            // Update the last known position of the current number
            lastPos[val] = i;
        }

        return maxLen;
    }

    // --- Segment Tree Helper Methods ---

    // Merges child values up to the parent
    private void pushUp(int node) {
        minTree[node] = Math.min(minTree[2 * node], minTree[2 * node + 1]);
        maxTree[node] = Math.max(maxTree[2 * node], maxTree[2 * node + 1]);
    }

    // Pushes lazy update values down to children
    private void pushDown(int node) {
        if (lazy[node] != 0) {
            int left = 2 * node;
            int right = 2 * node + 1;
            int val = lazy[node];

            lazy[left] += val;
            minTree[left] += val;
            maxTree[left] += val;

            lazy[right] += val;
            minTree[right] += val;
            maxTree[right] += val;

            lazy[node] = 0;
        }
    }

    // Range Update: Adds 'val' to all indices in [l, r]
    private void update(int node, int start, int end, int l, int r, int val) {
        if (l > end || r < start) return;

        if (l <= start && end <= r) {
            minTree[node] += val;
            maxTree[node] += val;
            lazy[node] += val;
            return;
        }

        pushDown(node);
        int mid = (start + end) / 2;
        update(2 * node, start, mid, l, r, val);
        update(2 * node + 1, mid + 1, end, l, r, val);
        pushUp(node);
    }

    // Query: Finds the leftmost index in [0, limit] where the value is 0
    private int findFirstZero(int node, int start, int end, int limit) {
        // If we go beyond the current sweep-line position, stop
        if (start > limit) return -1;
        
        // Pruning: If 0 is not in the [min, max] range of this node, it can't exist here
        if (minTree[node] > 0 || maxTree[node] < 0) return -1;

        // Leaf node check
        if (start == end) {
            return (minTree[node] == 0) ? start : -1;
        }

        pushDown(node);
        int mid = (start + end) / 2;

        // Try left child first to get the smallest index (which gives the longest subarray)
        int res = findFirstZero(2 * node, start, mid, limit);
        if (res != -1) return res;

        // If not found in left, try right
        return findFirstZero(2 * node + 1, mid + 1, end, limit);
    }
}