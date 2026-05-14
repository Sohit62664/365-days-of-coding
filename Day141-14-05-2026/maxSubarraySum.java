// Kadane is based on this observation:
// If:
// curr_sum<0
// then keeping it will only decrease future sums.
// So discard it.


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




//leetcode 
class Solution {
    public int maxSubArray(int[] nums) {
        // using Kadan's algo
        if(nums == null || nums.length == 0); // but the given Constraints tells the array will never be empty;
        int max_sum = nums[0] ;
        int curr_sum = 0 ;

        for(int num : nums){
            if(curr_sum  < 0){
                curr_sum = 0 ;
            }
            curr_sum += num;
            max_sum = Math.max(curr_sum , max_sum);
        }

        return max_sum;
    }
}
