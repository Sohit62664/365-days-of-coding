class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, 1);
        int max = 1;
        int count[] = new int[n];
        Arrays.fill(count, 1);
        int li = 0;
        for (int i = 1; i < n; i++) {
            for (int pre = 0; pre < i; pre++) {
                if (nums[i] > nums[pre] && dp[i] < 1 + dp[pre] ) {

                    
                        dp[i] = 1 + dp[pre];
                        count[i] = count[pre];
                    
                }else if ( nums[i] > nums[pre] && dp[i] == 1 + dp[pre]) {
                        count[i] = count[i] + count[pre];
                    }

            }
            if (max < dp[i]) {
                max = dp[i];
                li = i;
            }
        }

        int total = 0 ;

        for(int i =0 ; i< n ; i++ ){
            if(dp[i] == max){
                total+= count[i];
            }
        }

        // int count = 0;
        System.out.println(max);
        System.out.println(Arrays.toString(dp));
        System.out.println(Arrays.toString(count));

        if (max == 1) {
            return n;
        }
        return total;
    }
}
