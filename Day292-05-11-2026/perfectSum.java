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


// Memoization For method 01 Recursion
class Solution {
	static int perfectSum(int[] arr, int target) {
		// code here
		int n = arr.length;
		
		int dp [][] = new int[n][target+1];
		for(int [] row: dp){
		    Arrays.fill(row , -1);
		}

		return f(n - 1, 0, target, arr , dp);
	}

	static int f(int i, int sum, int target, int [] arr , int[][] dp) {
		if (i < 0) {
			// sum+= arr[i];
			if (sum == target) {
				return 1 ;
			} else {
				return 0 ;
			}

		}
		
		if(dp[i][sum] != -1) return dp[i][sum];

		int not_take = f(i - 1, sum, target, arr , dp );
		int take = 0 ; 
		if(arr[i] + sum <= target){
		    take = f(i - 1, sum + arr[i], target, arr , dp);
		}

		return dp[i][sum] = take + not_take;
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
		if(dp[i][sum] != -1) return dp[i][sum];

		int np = f(i-1 , sum , arr , dp);
		int pi = 0 ; 

		
		if(arr[i] <= sum){
		    pi = f(i-1  , sum - arr[i] , arr , dp);
		}

		return dp[i][sum]=  np + pi;
	}
}


//Tabulsation 
class Solution {
	static int perfectSum(int[] arr, int target) {
		// code here
		int n = arr.length;
		
		int dp [][] = new int[n][target + 1];
		
		// basecases
		for (int i = 0 ; i < n ; i++) {
			dp[i][0] = 1 ;
		}
		
		dp[0][0] = (arr[0] == 0)? 2:1 ;
		if (arr[0] != 0 && arr[0] <= target) {
			//  if(arr[i])
			
			dp[0][arr[0]] = 1 ;
			
		}
		
		for (int i = 1 ; i<n ; i++) {
			
			// see here if i use tar = 1 then it may possible that our tar = 0 , never get updated
			// evdn when we have multiple number of zeros
			for (int tar = 0 ; tar <= target ; tar++) {
				int nt = dp[i - 1][tar];
				
				int t = 0 ;
				if (arr[i] <= tar) {
					t = dp[i - 1][tar - arr[i]];
				}
				
				dp[i][tar] = (nt + t);
			}
		}
		
		return dp[n - 1][target];
	}
	
}
