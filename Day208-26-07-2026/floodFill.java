class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //m x n 
        int m = image.length;
        int n = image[0]. length ;
        int oldcolor = image[sr][sc];
        if (oldcolor == color) return image;
        dfs(image , sr , sc , color, oldcolor , n , m  );
        return image;
    }

    void dfs(int[][] image, int r, int c, int color, int oldcolor , int n , int m ){
        if(r>= m || c >= n|| r<0 || c<0 ) return ;
        if(image[r][c] != oldcolor) return ;

        
        image[r][c]= color;
        //checkout for nebhour 
        dfs(image , r , c+1 , color , oldcolor , n , m );
        dfs(image , r+ 1, c , color , oldcolor , n , m );
        dfs(image , r, c-1 , color , oldcolor , n , m );
        dfs(image , r- 1, c , color , oldcolor , n , m );


    }
}
