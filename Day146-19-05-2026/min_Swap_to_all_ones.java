// Broute force 
// First of all count all the number of ones in the array 
// If the count of ones is equal to zero then return minus one which means that we can't make grouping
// Now your question has been changed from grouping to all the ones you can reframe like this Find the minimum subarray which having at least size of K which means the size of once and we have to count minimum number of zero in it because that will be your answer The minimum number of zero means this much we can SW so that's the brute force 
class Solution {
	public int minSwaps(int[] arr) {
		// code here
		int ones = 0 ;
		
		for (int num : arr) {
			if (num == 1) {
				ones++;
			}
		}
		
		if (ones == 0)
			return - 1;
		int n = arr.length;
		int ans = Integer.MAX_VALUE ;
		for (int i = 0 ; i<=n-ones ; i++) {
			int zeros = 0 ;
			for (int j = i ; j<i + ones ; j++) {
				if (arr[j] == 0) {
					zeros++;
				}
			}
			ans = Math.min(zeros, ans);
		}
		
		return ans;
		
	}
}
