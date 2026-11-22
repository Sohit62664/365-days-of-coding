class Solution {
    static int matrixMultiplication(int arr[]) {
        // code here
        int n = arr.length;
        return f( 1 , n-1 , arr);
    }
    
    static int f(int i , int j , int[] A){
        if(i== j ) return 0 ;
        
        int min = (int) 1e9 ;
        
        for(int  k = i ; k <= j-1 ; k++){
            int steps = A[i-1] * A[k] * A[j] + f(i , k , A) + f(k+1 , j , A);
          
            
            min = Math.min(min , steps);
        }
        
        return min;
    }
}
