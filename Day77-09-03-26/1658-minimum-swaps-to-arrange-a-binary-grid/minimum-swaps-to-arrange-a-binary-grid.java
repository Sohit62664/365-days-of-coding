class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int [] needed = new int[n]; // number of zeros in the right side 

        // for counting no. of zero in right side in each row 
        for(int i=0 ; i< n ; i++){
            int zero =0;
            for(int j = n-1 ; j>= 0 ; j--){
                if(grid[i][j]==0){
                    zero++;
                }else{
                    break;
                }
            }
            needed[i]= zero;
        }

        int swap = 0 ;

        for(int i = 0 ; i< n ; i++){
            int required = n- i - 1; // required zeros

            int j  = i ;  
            //searching that required no.of zero is available or not 
            //if available then swap with adjacent until j > i
            while(j< n && needed[j]<required){
                j++;
            }

            if(j == n ) return -1; // requared no. of zeros is not available

            while(j>i){
                int temp = needed[j];
                needed[j]= needed[j-1];
                needed[j-1]= temp;
                j--;
                swap++;
            }
        }

        return swap ;
    }
}