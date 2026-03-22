class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (same(mat, target)) return true;
            mat = rotate(mat);
        }
        return false;
    }

    static int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] trans = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                trans[i][j] = mat[j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            reverseRow(trans[i]);
        }
        return trans;
    }

    static void reverseRow(int[] row) {
        int i = 0, j = row.length - 1;
        while (i < j) {
            int temp = row[i];
            row[i] = row[j];
            row[j] = temp;
            i++;
            j--;
        }
    }

    static boolean same(int[][] a, int[][] b) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }
}
