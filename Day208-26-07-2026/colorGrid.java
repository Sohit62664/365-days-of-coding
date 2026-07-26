class Solution {
    public int[][] colorGrid(int n, int m, int[][] sources) {
        int[][] image = new int[n][m];
        int[][] ans = new int[n][m];

        for (int i = 0; i < n; i++) {
            ans[i] = image[i].clone();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int[] source : sources) {
            int sr = source[0];
            int sc = source[1];
            image[sr][sc] = Math.max(image[sr][sc], source[2]);
            list.add(source[2]);
        }
        for (int i = 0; i < n; i++) {
            ans[i] = image[i].clone();
        }

        while (!done(image, n, m)) {

            //simultanously update 
            for (int sr : list) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (image[i][j] == sr) {
                            if (i - 1 >= 0 && image[i - 1][j]==0 )
                                ans[i - 1][j] = Math.max(ans[i - 1][j], sr);
                            if (i + 1 < n && image[i + 1][j]==0)
                                ans[i + 1][j] = Math.max(ans[i + 1][j], sr);
                            if (j - 1 >= 0 && image[i][j - 1]==0)
                                ans[i][j - 1] = Math.max(ans[i][j - 1], sr);
                            if (j + 1 < m && image[i][j + 1]==0)
                                ans[i][j + 1] = Math.max(ans[i][j + 1], sr);
                        }
                    }
                }

            }
            for (int i = 0; i < n; i++) {
                image[i] = ans[i].clone();
            }
        }

        return ans;

    }

    boolean done(int[][] image, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (image[i][j] == 0)
                    return false;
            }
        }

        return true;
    }
}
