// Recursive Solution
class Solution {
	int min = 0 ;
	public int minDifference(int arr[]) {
		// code here
		int tsum = 0 ;
		for (int x : arr)
			tsum += x;
		min = Integer.max_value ;
		
		int n = arr.length;
		
		return f(n - 1, 0, arr, tsum);
	}
	
	void f(int index, int sum2, int[] arr, int tsum) {
		if (index <= 0) {
			
			// 			min = Math.min(min, sum2);
			sum2+=arr[index];
			int sum1 = tsum - sum2;
			
			min = Math.min(min, Math.abs(sum1 - sum2));
			
			return;
		}
		
		
		int take = f(index - 1, sum2 + arr[index], arr, tsum);
		int not_take = f(index - 1, sum2, arr, tsum);
		
	}
}




// Using Dp

	class Solution {
	public int minDifference(int arr[]) {
		// code here
		int n = arr.length ;
		int sum = 0;
		for (int x : arr)
			sum += x;
		boolean[][] dp = new boolean[n][sum + 1];
		
		for (int i = 0 ; i < n ; i++) {
			dp[i][0] = true;
		}
		
		if (arr[0] <= sum) {
			dp[0][arr[0]] = true ;
		}
		
		for (int i = 1 ; i<n ; i++) {
			for (int tar = 1 ; tar <= sum ; tar++) {
				
				boolean not_take = dp[i - 1][tar] ;
				boolean take = false ;
				
				if (arr[i] <= tar) {
					take = dp[i - 1][tar - arr[i]];
				}
				
				// if(not_take || take){
				//     int sum1 = target //if not take case ow target-arr[i];
				//     int sum2 = sum - sum1;
				//     min = Math. min(min , Math.abs(aum1 - sum2 )
				// }
				
				dp[i][tar] = not_take|| take;
			}
		}
		
	    int min = Integer.MAX_VALUE;
		
		for (int i = 0 ; i<n ; i++) {
			for (int tar = 0 ; tar <= sum ; tar++) {
				if (dp[i][tar]) {
					int sum1 = tar ;
					int sum2 = sum - sum1;
					min = Math. min(min, Math.abs(sum1 - sum2));
				}
			}
		}
		
		
		return min ;
	}
}
