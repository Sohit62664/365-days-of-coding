class Solution {
    public int[] maxValue(int[] nums) {
        // by Array Pre Processing Technique
        int n= nums.length;
        int[] pre= new int[n];
        int[] suff= new int[n];
        int pre_max = nums[0];
        int suff_min = nums[n-1];
        for(int i =0 ; i< n  ; i++){
            pre_max = Math.max(nums[i] , pre_max);
            pre[i] = pre_max;
        }

        for(int j = n-1 ; j>= 0 ; j--){
            suff_min= Math.min(suff_min , nums[j]);
            suff[j]= suff_min ;
        }
        int [] ans = new int[n];

        ans[n-1] = pre[n-1];
        for(int i = n-2 ; i>= 0 ; i--){
            ans[i]= pre[i];
            if(pre[i]>suff[i+1]){
                ans[i]= ans[i+1];
            }
        }

        return ans;


    }
}
