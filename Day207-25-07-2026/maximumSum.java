class Solution {
	public int maximumSum(int[][] mat, int k) {
		// code here
		// submatrix
		// genrate all the submatrix and take the sum  track th maximum one
		// how?
		// brute force
		// genrate all the submatrix of size k and take it's sum track the maximum
		
		int max_sum = Integer.MIN_VALUE ;
		int n = mat.length ;
		for (int i = 0 ; i <= n - k ; i++) {
			for (int j = 0 ; j <= n - k ; j++) {
				
				// now we have the Starting index of each and every possible matrix
				int curr_sum = 0 ;
				for (int l = i ; l < i + k ; l++) {
					for (int m = j ; m < j + k ; m++) {
						curr_sum += mat[l][m];
					}
				}
				
				max_sum = Math.max(max_sum, curr_sum);
			}
		}
		
		return max_sum;
		
	}
}
