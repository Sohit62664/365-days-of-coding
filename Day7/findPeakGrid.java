import java.util.ArrayList;

public class findPeakGrid {
    class Solution {
        public ArrayList<Integer> findPeakGrid(int[][] mat) {
            // int n = mat.length;
            // int m = mat[0].length;

            // int low = 0, high = m - 1;

            // while (low <= high) {
            // int mid = low + (high - low) / 2;

            // int maxRow = 0;
            // for (int i = 0; i < n; i++) {
            // if (mat[i][mid] > mat[maxRow][mid]) {
            // maxRow = i;
            // }
            // }

            // int left = (mid - 1 >= 0) ? mat[maxRow][mid - 1] : -1;
            // int right = (mid + 1 < m) ? mat[maxRow][mid + 1] : -1;

            // if (mat[maxRow][mid] > left && mat[maxRow][mid] > right) {
            // ArrayList<Integer> ans = new ArrayList<>();
            // ans.add(maxRow);
            // ans.add(mid);
            // return ans;
            // }

            // else if (left > mat[maxRow][mid]) {
            // high = mid - 1;
            // } else {
            // low = mid + 1;
            // }
            // }

            // return new ArrayList<>();

            int n = mat.length;
            int m = mat[0].length;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    boolean flag = true;
                    if (i + 1 < n && mat[i][j] < mat[i + 1][j])
                        flag = false;
                    if (i - 1 >= 0 && mat[i][j] < mat[i - 1][j])
                        flag = false;
                    if (j + 1 < m && mat[i][j] < mat[i][j + 1])
                        flag = false;
                    if (j - 1 >= 0 && mat[i][j] < mat[i][j - 1])
                        flag = false;

                    if (flag) {
                        ArrayList<Integer> ans = new ArrayList<>();
                        ans.add(i);
                        ans.add(j);
                        return ans;
                    }
                }
            }
            return new ArrayList<>();

        }
    }

}
