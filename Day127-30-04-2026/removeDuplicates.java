class Solution {
    public int removeDuplicates(int[] nums) {
        //another type of slow and fast pointer approach
        int i = 0 ;
        // int k = 0 ;
        for(int j = 1 ; j< nums.length ; j++){
            if(nums[i]!=nums[j]){
                i++;
                nums [i] = nums[j];
            }
        }
        return i+1 ; // becauce i is an index 
    }
}
