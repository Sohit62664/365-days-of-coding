Broute force 

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
