class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        return f(arr , arr.length-1 , sum);
        
        
    }
    
    static boolean f(int[] arr,int idx , int target){
        if(target == 0) return true ;
        if(idx ==0) return arr[idx] == target ;
        // if(idx <0) return false ;
        
        boolean not_take = f(arr , idx-1 , target);
        boolean take = false ; 
        if(arr[idx] <= target){
            take = f(arr, idx-1 , target - arr[idx]);
        }
        
        return not_take || take;
    }
}
