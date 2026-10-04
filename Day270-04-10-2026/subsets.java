class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        helper(0 , nums , ls);
        return ans ;
    }

    void helper(int i , int[] nums , List<Integer> result){
        if (i == nums.length){
            List<Integer> ls = new ArrayList<>();
            for(int x : result){
                ls.add(x);
            }
            ans.add(ls);
            return ;
        }

        result.add(nums[i]);
        helper(i+1 , nums , result);
        result.remove(result.size()-1);
        helper(i+1 , nums , result);


    }
}
