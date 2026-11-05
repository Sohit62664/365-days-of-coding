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

