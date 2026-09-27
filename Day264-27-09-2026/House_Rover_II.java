// Recursive approach
class Solution {
    public int rob(int[] nums) {
        int n = nums.length ;
        if(n== 1) return nums[0];
        int ans1 = helper1(nums , n-1); // removing the first
        int ans2 = helper2(nums , n-2); // removing the last

        return Math.max(ans1 , ans2);
    }

    int helper1 (int nums[] , int i ){
        if(i == 1){
            return nums[1];
        }

        if(i < 1 ) return 0 ;

        int pick = nums[i] ;
        if( i > 2){
            pick+= helper1(nums , i-2);
        }
        int non_pick = helper1(nums , i -1);

        return Math.max(pick , non_pick);
    }

    int helper2 (int nums[] , int i ){
        if(i ==0){
            return nums[0];
        }

        if(i < 0 ) return 0 ;

        int pick = nums[i] ;
        if( i > 1){
            pick+= helper2(nums , i-2);
        }
        int non_pick = helper2(nums , i -1);

        return Math.max(pick , non_pick);
    }
}


class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];

        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        int dp1[] = new int[n + 1];
        Arrays.fill(dp1, -1);
        int ans1 = helper1(nums, n - 1, dp1); // removing the first
        int ans2 = helper2(nums, n - 2, dp); // removing the last

        return Math.max(ans1, ans2);
    }

    int helper1(int nums[], int i ,int [] dp) {
        if (i == 1) {
            return nums[1];
        }

        if (i < 1)
            return 0;

        if(dp[i]!= -1) return dp[i];

        int pick = nums[i];
        if (i > 2) {
            pick += helper1(nums, i - 2 , dp);
        }
        int non_pick = helper1(nums, i - 1, dp);
        return dp[i] = Math.max(pick, non_pick);
    }

    int helper2(int nums[], int i, int[] dp) {
        if (i == 0) {
            return nums[0];
        }
        if (i < 0)
            return 0;
        if (dp[i] != -1)
            return dp[i];

        int pick = nums[i];
        if (i > 1) {
            pick += helper2(nums, i - 2, dp);
        }
        int non_pick = helper2(nums, i - 1, dp);

        return dp[i] = Math.max(pick, non_pick);
    }
}



