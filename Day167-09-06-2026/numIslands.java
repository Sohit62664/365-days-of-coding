class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m= grid[0].length;
        int island = 0 ;

        boolean [][] visited = new boolean[n][m];
        for(int i =0 ; i< n ; i++){
            for(int j =0 ; j < m ; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    dfs(i , j , visited , n , m , grid);
                island++;
                }
            }
        }

        return island;
    }

    public void dfs(int i , int j , boolean [][] visited , int n , int m , char [][]grid){

        if(i>=n || j>=m || i<0 || j<0 || visited[i][j] || grid[i][j]!='1'){ //order maters
            return ;
        }
        visited[i][j] = true;

        dfs(i+1, j , visited , n , m , grid);
        dfs(i-1, j , visited , n , m , grid);
        dfs(i, j+1 , visited , n , m , grid);
        dfs(i, j-1 , visited , n , m , grid);
    }
}
