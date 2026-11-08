class Solution {
    int floorSqrt(int n) {
        // code here
        int low = 0 ; 
        int high = n ;
        int target = n ;
        
        while(low<= high){
            int mid = low + (high - low)/2 ;
            if(mid*mid == target){
                return mid;
            }else if(mid*mid < target){
                low = mid+1 ;
            }else{
                high = mid-1;
            }
        }
        
        return low-1;
    }
}
