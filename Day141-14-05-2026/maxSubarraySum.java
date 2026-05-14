class Solution {
	int maxSubarraySum(int[] arr) {
		// Code here
		int curr_sum = 0 ;
		
		int max = Integer.MIN_VALUE;
		for (int i = 0 ; i<arr.length ; i++) {
			if (curr_sum < 0) {
				curr_sum = 0 ;
				
			}
			curr_sum += arr[i];
			
			max = Math.max(curr_sum, max);
		}
		
		return max;
		
	}
}







class Solution {
	int maxSubarraySum(int[] arr) {
		// Code here
		int curr_sum = 0 ;
		int c_sum [] = new int [arr.length];
		
		int max = Integer.MIN_VALUE;
		for (int i = 0 ; i<arr.length ; i++) {
			if (curr_sum < 0) {
				curr_sum = 0 ;
				
			}
			curr_sum += arr[i];
			c_sum[i] = curr_sum;
			
		}
		
		for (int num: c_sum) {
			max = Math.max(num, max);
		}
		
		return max;
		
	}
}
