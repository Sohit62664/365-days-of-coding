import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int m, int n) {
		// Write your code here.
		int dp[][] = new int[m][n];
		dp[0][0] = 1 ;

		for(int i =0 ; i< m ; i++){
			for(int j=0 ; j < n ; j++){
				if(i==0 && j ==0) {
					continue ;
				}

				int up = 0 ; 
				int left = 0 ;

				if(j  > 0) {
					left = dp [i][j-1];
				}

				if(i> 0 ){
					up = dp[i-1][j];
				}

				dp[i][j] = up + left ;
			}
		}

		return dp[m-1][n-1];

	}
}




// Recursive solution 
class Solution {
    public int uniquePaths(int m, int n) {
        return helper(m-1 , n-1);
    }

    int helper(int i , int j){
        if(i==0 && j ==0) {
            return 1;
        }

        if(i< 0 || j < 0) return 0 ; 

        int up = helper(i-1 , j);
        int left = helper(i , j-1);

        return up + left;
    }
}




