class Solution {
	public int maxCircularSum(int arr[]) {
		// code here
		/* This is bruite force approach
		logc is simple we are able to find out the sum of circulated array
		because of (i + j)%n
		every time we compare with ans
		int ans = Integer.MIN_VALUE;
		int n = arr.length;
		*/
		for (int i = 0 ; i<n ; i++) {
			int currSum = 0 ;
			
			for (int j = 0 ; j<n ; j ++) {
				int idx = (i + j)% n ;
				currSum += arr[idx];
				
				ans = Math.max(currSum, ans);
				
			}
		}
		
		return ans;
		
	}
}




// optimize approach 
class Solution {
	
	public int maxCircularSum(int arr[]) {
		
		int totalSum = 0;
		
		// For maximum subarray
		int currMax = arr[0];
		int maxSum = arr[0];
		
		// For minimum subarray
		int currMin = arr[0];
		int minSum = arr[0];
		
		for (int i = 0 ; i < arr.length ; i++) {
			
			totalSum += arr[i];
			
			if (i > 0) {
				
				// Kadane for max
				currMax = Math.max(arr[i],currMax + arr[i]);
				
				maxSum = Math.max(maxSum,currMax);
				
				// Kadane for min
				currMin = Math.min(arr[i], currMin + arr[i]);
				
				minSum = Math.min(minSum,currMin);
			}
		}
		
		// all elements negative
		if (maxSum < 0) {
			return maxSum;
		}
		
		
		int circularSum = totalSum - minSum;
		
		return Math.max(maxSum, circularSum);
	}
}
