class Solution {
    public int search(int[] nums, int target) {
        // using recursion

        return bin_search(nums, target, 0, nums.length - 1);
    }

    public int bin_search(int[] nums, int target, int st, int end) {
        if (st <= end) {
            int mid = st + (end - st) / 2;
            if(nums[mid]== target){
                return mid;
            }else if(nums[mid]>target){
                return bin_search(nums , target , st , mid-1);
            }else{
                return bin_search(nums , target , mid+1 , end );
            }
        }else{
            return -1;
        }
        

    }
}