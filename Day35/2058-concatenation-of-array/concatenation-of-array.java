class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        // int t= (nums.length)*2;
        int[] ans =new int[n*2];
        // int j=0;
        for(int i= 0 ; i< n; i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
            // j++;
        }
        return ans;
    }
}