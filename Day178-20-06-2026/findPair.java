


// Binn Search Is not apropriate because There may be duplicate element we need to handle them as well
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        // Naive Approach 
        //two sum
        Arrays.sort(arr);
        for(int i =0 ; i< arr.length  ; i++){
            int one = arr[i];
            int compliment = x + one ;
            
            if(finder(compliment  , arr)){
                return true;
            }
        }
        return false ;
    }
    
    boolean finder(int target , int [] arr){
        int st = 0 ; 
        int end = arr.length -1 ;
        
        while(st <= end){
            int mid = st+ (end-st)/2 ;
            
            if(arr[mid]== target){
                return true;
            }else if(arr[mid] >target){
                end = mid -1 ;
            }else{
                st = mid+1 ;
            }
        }
        
        return false;
    }
}
