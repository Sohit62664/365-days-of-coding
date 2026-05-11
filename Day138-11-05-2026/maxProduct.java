// Find the 3 largest numbers.
// Find the 2 smallest (most negative) numbers.
// Compute product of 3 largest numbers.
// Compute product of largest number and 2 smallest numbers.
// Return the maximum of both products.


class Solution {
	int maxProduct(int[] arr) {
		// code here
		// three gretest
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		// Two Smallest
		int first_s = Integer.MAX_VALUE;
		int second_s = Integer.MAX_VALUE;
		
		for (int num : arr) {
			if (num>first) {
				third = second ;
				second = first ;
				first = num;
			} else if (num > second) {
				third = second;
				second = num;
			} else if (num > third) {
				third = num;
			}
			
			if (num<first_s) {
				
				second_s = first_s ;
				first_s = num;
			} else if (num < second_s) {
				
				second_s = num;
			}
		}
		
		int max = Integer.MIN_VALUE;
		if (first_s <0 && second_s<0) {
			max = Math.max(max, first_s* second_s * first);
		}
		max = Math.max(max, first* second* third);
		return max;
	}
}
