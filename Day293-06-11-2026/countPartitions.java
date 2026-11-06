// Recursive Solution


class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int n = arr.length ; 
        int tsum =0 ;
        for(int x : arr) tsum += x ; 
        
        if((( diff+tsum)  & 1) !=0 ) return 0 ; 
        if(diff > tsum) return 0 ; 
        int target = (diff+ tsum)/2;
        
        
        
        return helper(n-1 , target , arr);
    }
    
    int helper(int i , int tar , int [] arr){
        if(i < 0){
            if(tar == 0 ) return 1; 
            else return 0 ; 
        }
        
        int np = helper(i - 1 , tar , arr);
        int pi = 0; 
        if(arr[i] <= tar){
            pi = helper(i-1 , tar- arr[i]  , arr);
        }
        
        return np + pi ; 
    }    
}
