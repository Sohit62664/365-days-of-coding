package Day8;

public class Search_a_2D_Matrix {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int n = matrix.length;
            int m = matrix[0].length;

            int st = 0; // uperbound
            int end = n - 1; // lower bound

            while (st <= end) {
                int mid = st + (end - st) / 2;

                if (matrix[mid][0] == target) {
                    return true;
                } else if (matrix[mid][0] > target) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
            if (end < 0)
                return false;

            int low = 0;
            int high = m - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (matrix[end][mid] == target) {
                    return true;
                } else if (matrix[end][mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            return false;
        }
    }
}
