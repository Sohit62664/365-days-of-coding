class Solution {
    ArrayList<List<Integer>> ans  = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        helper(nums , 0 );
        return ans ;

    }

    void helper(int [] nums , int i){
        if(i == nums.length){
        ArrayList<Integer> list =  new ArrayList<>();
            for(int c: nums){
                list.add(c);
            }
            ans.add(list);
            return;
        }


        for(int j  = i ; j< nums .length ; j++){
            swap(nums , i , j);

            helper(nums , i+1);

            swap(nums , i , j);
        }

        

        
    }

    void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
