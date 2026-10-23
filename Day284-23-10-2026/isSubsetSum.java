class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        
        return helper(n-1 , sum , arr);
    }
    static boolean helper( int  i , int target , int [] arr){
        // base case 
        if(target == 0 ) return true;
        if(i ==0 ) return arr[i]== target;
        
        //nottake
        
        boolean not_take = helper(i-1, target , arr);
        
        boolean take = false;
        
        if(arr[i]<= target){
             take = helper(i-1, target- arr[i], arr);
        }
        
        return not_take || take;
    }
}
