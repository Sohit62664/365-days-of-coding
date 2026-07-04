class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // bit Masking 

        int n = nums.length; 
        int sub_cnt = 1 << n ;

        List<List<Integer >> result = new ArrayList<>();

        for(int mask = 0 ; mask < sub_cnt ; mask ++){
            List<Integer> subset = new ArrayList <>();
            for(int i =0 ; i< n ; i++){

                if(( mask & (1 << i)) != 0 ){
                    subset.add(nums[i]);
                }
            }

            result.add(subset);
        }

        return result;
    }
}
