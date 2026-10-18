class Solution {
    
    public int cherryPickup(int[][] grid) {
        int n = grid.length ; 
        return f(0 , 0 , n-1 , grid , n);
    }

    int f(int i , int j1 , int j2 , int [][] a , int n ){
        
        if(j1 < 0 || j1 >= n || j2 <0 || j2>= n){
            return Integer.MIN_VALUE;
        }

        if(i == n-1) {
            if( j1 == j2 ){
                return a[i][j1];
            }else{
                return a[i][j1]+ a[i][j2];
            }
        }

        int maxmi = Integer.MIN_VALUE;
        for(int dj1 = -1 ; dj1 <=1 ; dj1++){
            for(int dj2 = -1 ; dj2 <=1 ; dj2++){
                if(j1 == j2){
                    maxmi = Math.max(maxmi , a[i][j1] + f(i + 1  , j1+ dj1 , j2 + dj2 , a  , n  ) );
                }else{
                    maxmi = Math.max(maxmi , a[i][j1] + a[i][j2] + f(i +1 , j1+ dj1 , j2 + dj2 , a , n )  );
                }
            }
        }

        return maxmi;
    }
}
