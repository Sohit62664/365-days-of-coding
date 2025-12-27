package Day9;

public class Rotate_Image {
    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            //taking transpose 
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            //revercing the rows 
            reverce_row(matrix);
            return;
        }

        static int[][] reverce_row(int[][] mat) {
            int n = mat.length;
            for (int i = 0; i < n; i++) {
                int j = 0;
                int k = n - 1;
                while (j < k) {
                    // swap(mat[i][j], mat[i][k]);
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][k];
                    mat[i][k] = temp;
                    j++;
                    k--;
                }
            }
            return mat;
        }

    }
}
