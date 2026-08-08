
// by this approach we canot get the corrwect output because we loose the index of that charecter 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1; 

        Arrays.sort(nums);
        while(left < right){
            int sum = nums[right]+ nums[left] ;

            if(sum == target ){
                return new int[]{left , right};
            }else if(sum < target){
                left++;
            }else{
                right--; 
            }
        }

        return new int[]{-1,-1};
    }
}
