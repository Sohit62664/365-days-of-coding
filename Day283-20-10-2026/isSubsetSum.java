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






//Tabulation 
class Solution {
	static boolean isSubsetSum(int arr[], int sum) {
		// code here
		boolean [][] dp = new boolean[arr.length][sum + 1];
		
		int n = arr.length;
		for (int i = 0 ; i<n ; i++) {
			dp[i][0] = true ;
		}
		
		if (arr[0] <= sum) {
			dp[0][arr[0]] = true;
		}
		
		for (int i = 1 ; i<n ; i++) {
			for (int target = 1 ; target <= sum ; target++) {
				boolean not_take = dp[i - 1][target];
				boolean take = false;
				
				if (target >= arr[i]) {
					take = dp[i - 1][target - arr[i]];
				}
				
				boolean value = false ;
				if (not_take || take) {
					value = true ;
				}
				dp[i][target] = value ;
			}
		}
		
		return dp[n - 1][sum];
		
	}
}
