class Solution {
	public int findCoverage(int[][] mat) {
		// code here
		// brute force
		int n = mat.length ;
		int m = mat[0].length;
		
		int cov = 0;
		
		for (int i = 0 ; i<n ; i++) {
			for (int j = 0 ; j<m ; j++) {
				if (mat[i][j] == 0) {
					// top
					// left
					// right
					// bottom
					cov += covrage(mat, i, j, n, m);
					
				}
			}
		}
		return cov;
		
	}
	
	int covrage(int [][] mat, int i, int j, int n, int m) {
		int count = 0 ;
		// top
		
		int ii = i;
		while (ii >= 0) {
			if (mat[ii][j] == 1) {
				count++;
				break;
			}
			ii--;
		}
		
		// bottom
		ii = i;
		while (ii < n) {
			if (mat[ii][j] == 1) {
				count++;
				break;
			}
			ii++;
		}
		
		// left
		int jj = j;
		while (jj >= 0) {
			if (mat[i][jj] == 1) {
				count++;
				break;
			}
			jj--;
		}
		
		// right
		jj = j;
		while (jj < m) {
			if (mat[i][jj] == 1) {
				count++;
				break;
			}
			jj++;
		}
		
		return count;
	}
	
}
