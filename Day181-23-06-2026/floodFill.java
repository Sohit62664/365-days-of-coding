class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        boolean visited[][] = new boolean [n][m];
        int num = image[sr][sc];
        dfs(image , sr , sc , color ,n , m , num);
        return image;
    }

    void dfs(int[][] image, int i, int j, int color , int n , int m,int num){
        if( i<0 || j<0 || i == n || j== m || image[i][j]== color){
            return ; 
        }

        if(image[i][j]==num){
            image[i][j]=color;
            //left 
            if(j-1>=0)
            dfs(image , i , j-1,  color , n , m,num);
            //right 
            if(j+1<m)
            dfs(image , i , j+1,  color , n , m,num);
            //up 
            if(i-1>=0)
            dfs(image , i-1 , j,  color , n , m,num);
            //down
            if(i+1<n)
            dfs(image , i+1 , j,  color , n , m,num);
        }else{
            return;
        }

        
    }
}



