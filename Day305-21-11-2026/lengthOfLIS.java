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
