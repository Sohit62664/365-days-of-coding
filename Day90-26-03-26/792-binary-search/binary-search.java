class Solution {
    public int search(int[] nums, int target) {
        return bin_search(nums, 0 , nums.length-1 , target);
    }

    int bin_search(int [] nums , int st ,int end , int target){
        if(st<=end){
            int mid = st+(end-st)/2;
            if(target == nums[mid]) {
                return mid;
            }else if(nums[mid]<target){//right call
                return bin_search(nums , mid+1 , end , target );
            }else{//left call
                return bin_search(nums , st , mid-1 , target );
            }
        }
        return -1;
    }
}