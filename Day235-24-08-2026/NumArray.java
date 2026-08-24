class NumArray {
    int [] prefix_sum ;
    public NumArray(int[] nums) {
        int n = nums.length; 
        prefix_sum = new int [n];

        prefix_sum[0]= nums[0];

        for(int i =1 ; i< n ; i++){
            prefix_sum[i] = nums[i]+prefix_sum[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0 ) return prefix_sum[right];
        return prefix_sum[right]-prefix_sum[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
