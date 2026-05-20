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
