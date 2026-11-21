class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums); // now this is converted into longest divisible subsequences 
        int n = nums.length ;
        int dp[] = new int[n] ;
        int hash[] = new int[n];
        Arrays.fill(dp , 1) ; // becouse the element is self may be the longest one so default store 1 

        int maxmi = 1 ;
        int li = 0 ;
        for(int i = 1 ; i< n ; i++){
            hash[i] = i  ;

            for(int pre = 0 ; pre<i ; pre++){
                if(nums[i] % nums[pre] == 0 && dp[i]  < 1 + dp[pre]  ) {
                    dp[i] = 1 + dp[pre] ;
                    hash[i] = pre ;
                }

                if(maxmi < dp[i]){
                    maxmi = dp[i];
                    li = i ;
                }
            }
        }
        

        List<Integer> ls = new ArrayList<>();

        ls.add(nums[li]);

        int ii = li ;
        while(hash[ii] != ii){
            ii = hash[ii];
            ls.add(nums[ii]);
            // li = index ;
        }

        return ls; 
    }
}
