class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        // first Aproach 
        if(x==0){
            return -1 ;
        }
        if(arr.length == 1){
            if(arr[0]<x){
                return 0;
            }else{
                return -1;
            }
        }
        
        int i =0 ;
        while(i<arr.length && arr[i]<=x){
            i++;
        }
        
        i--;
        return i;
    }
}





class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        // Optimized Approach 
        // Binary Search
        
        int result = -1;
        int st =0 ; 
        int end = arr.length-1 ;
        
        while(st <= end){
            int mid = st + (end-st)/2;
            
            if(arr[mid] <= x){
                result = mid ;
                st = mid +1;
            }else{
                end = mid -1 ;
            }
        }
        return result;
    }
}
