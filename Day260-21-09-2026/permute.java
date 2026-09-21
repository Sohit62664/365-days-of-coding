class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        solver(nums, 0 );
        return ans ; 
    }

    void solver(int[]nums , int i ){
        if(i == nums.length){
            List<Integer> ls = new ArrayList<>();

            for(int x: nums){
                ls.add(x);
            }

            ans.add(ls);
            return;
        }


        for (int j = i ; j < nums.length ; j++){
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j]= temp;

            solver(nums , i+1);
             temp = nums[i];
            nums[i]= nums[j];
            nums[j]= temp;
        }
    }
}
