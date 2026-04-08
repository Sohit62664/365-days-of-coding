class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        int q = queries.length;
        for(int i =0 ; i< q ; i++){
            int li = queries[i][0];
            int ri = queries[i][1];
            int ki = queries[i][2];
            int vi = queries[i][3];

            int idx = li;
            while(idx<=ri){
               nums[idx] = (int)((nums[idx] * 1L * vi) % 1000000007);
                idx+=ki;
            }
        }
        int result = nums[0];
        for(int i =1 ; i< n ; i++){
            result ^= nums[i];
        }
        return result;
    }
}