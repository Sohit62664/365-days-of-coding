class Solution {
    
    public int cherryPickup(int[][] grid) {
        int n = grid.length ;
        int m = grid[0].length;
        return f(0 , 0 , m-1 , grid , n , m);
    }

    int f(int i , int j1 , int j2 , int [][] a , int n , int m){
        
        if(j1 < 0 || j1 >= m || j2 <0 || j2>= m){
            return  (int)-1e8;
        }

        if(i == n-1) {
            if( j1 == j2 ){
                return a[i][j1];
            }else{
                return a[i][j1]+ a[i][j2];
            }
        }

        int maxmi = (int)-1e8;
        for(int dj1 = -1 ; dj1 <=1 ; dj1++){
            for(int dj2 = -1 ; dj2 <=1 ; dj2++){
                // if(j1 == j2){
                //     maxmi = Math.max(maxmi , a[i][j1] + f(i + 1  , j1+ dj1 , j2 + dj2 , a  , n  ) );
                // }else{
                //     maxmi = Math.max(maxmi , a[i][j1] + a[i][j2] + f(i +1 , j1+ dj1 , j2 + dj2 , a , n )  );
                // }

                int value = 0 ;
                if(j1 == j2) {
                    value = a[i][j1];
                }else{
                    value = a[i][j1] + a[i][j2];
                }
                value+= f(i+1 , j1+ dj1 , j2+dj2 , a , n , m );
                maxmi = Math.max(maxmi , value );
            }
        }

        return maxmi;
    }
}
