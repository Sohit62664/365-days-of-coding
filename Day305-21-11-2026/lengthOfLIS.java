class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length ;
        
        return f(n-1 , Integer.MAX_VALUE , nums);
    }

    int f(int i , int prev ,int []nums){
        if(i< 0) return 0 ;

        int np =  f(i-1 , prev , nums);
        int p = Integer.MIN_VALUE ;

        if(nums[i] < prev){
            p = 1+ f(i-1 , nums[i] , nums);
        }

        return Math.max(np , p );
    }
}



//memoization 
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length ;
        // int e = (int) 10e4 ;
        int dp[][] = new int[n][n+1];

        for(int row[]: dp){
            Arrays.fill(row , -1);
        }
        return f(n-1 , -1 , nums , dp );
    }

    int f(int i , int prev ,int []nums , int [][] dp){
        if(i< 0) return 0 ;
        // int index = (int) 10e4 + prev ; 
        if(dp[i][prev+1] != -1) return dp[i][prev+1];

        int np =  f(i-1 , prev , nums , dp);
        int p = 0 ;
        
        if(prev== -1 || nums[i] <nums[prev]){
            p = 1+ f(i-1 , i, nums  , dp);
        }

        return dp[i][prev+1] = Math.max(np , p );
    }
}



//recursion

class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length ;

        
        return f(0 ,  -1 , n , nums );
    }

    int f(int i , int prev_index ,int n , int[] nums ){
        if(i == n) return 0 ;

        int nt =  f(i+1 , prev_index  , n , nums);

        int take= 0 ; 

        if(prev_index==-1 || nums[prev_index] < nums[i] ){
            take =1 +  f(i+1 , i , n , nums);
        }

        return Math.max(take , nt);
    }
}
