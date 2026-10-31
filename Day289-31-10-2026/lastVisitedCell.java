class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int i = 0;
        int j = 0;
        int r = grid.length;
        int c = grid[0].length;
        boolean visited [][] = new boolean[r][c];
        int prei = i, prej = j;
        while (i >= 0 && j >= 0 && i < r && j < c && !visited[i][j]) {
            prei = i;
            prej = j;

            if (grid[i][j] == 'R'){
                visited[i][j] = true ;
                j++;
            }
            else if (grid[i][j] == 'U'){
                visited[i][j] = true ;
                i--;
            }
            else if (grid[i][j] == 'D'){
                visited[i][j] = true ;
                i++;
            }
            else {
                //left
                visited[i][j] = true ;
                j--;
            }

        }

        return new int[] { prei, prej };
    }

}
