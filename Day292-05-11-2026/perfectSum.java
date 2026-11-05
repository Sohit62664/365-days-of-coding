// Recurasive Solution 01

class Solution {
	static int perfectSum(int[] arr, int target) {
		// code here
		int n = arr.length;
		
		return f(n - 1, 0, target, arr);
	}
	
	static int f(int i, int sum, int target, int [] arr) {
		if (i < 0) {
			// sum+= arr[i];
			if (sum == target) {
				return 1 ;
			} else {
				return 0 ;
			}
			
		}
		
		int not_take = f(i - 1, sum, target, arr);
		int take = f(i - 1, sum + arr[i], target, arr);
		   
		return take + not_take;
	}
}


// Resursive Solution 02
class Solution {
	static int perfectSum(int[] arr, int target) {
		// code here
		int n = arr.length;
		
		return f(n - 1, target, arr);
	}
	
	static int f(int i, int sum, int [] arr) {
		if(i < 0 ){
		    if(sum == 0){
		        return 1 ;
		    }else{
		        return 0 ;
		    }
		}
		
		int np = f(i-1 , sum , arr );
		int pi = 0 ; 
		
		if(arr[i] <= sum){
		    pi = f(i-1  , sum - arr[i] , arr);
		}
		
		
		return np + pi ; 
	}
}



// Memoization of method 02 
class Solution {
	static int perfectSum(int[] arr, int target) {
		// code here
		int n = arr.length;
		
		int dp [][] = new int[n][target+1];
		for(int [] row: dp){
		    Arrays.fill(row , -1);
		}

		return f(n - 1, target, arr , dp);
	}

	static int f(int i, int sum, int [] arr , int[][] dp) {
		if(i < 0 ){
		    if(sum == 0){
		        return 1 ;
		    }else{
		        return 0 ;
		    }
		}

		int np = f(i-1 , sum , arr , dp);
		int pi = 0 ; 

		if(dp[i][sum] != -1) return dp[i][sum];
		
		if(arr[i] <= sum){
		    pi = f(i-1  , sum - arr[i] , arr , dp);
		}

		return dp[i][sum]=  np + pi;
	}
}
