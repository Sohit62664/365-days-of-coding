class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0 ;

        for(int num : nums){
            if(num!= 0){
                nums[pos++] = num;
            }
        }

        while(pos<nums.length){
            nums[pos]= 0;
            pos++;
        }
    }
}



// Using Slow and Fast Pointer approach 
class Solution {
    public void moveZeroes(int[] nums) {
        // using Slow and Fast pointer Approach

        int slow = 0 ; 
        for(int fast = 0 ; fast< nums.length ; fast++){
            if(nums[fast]!=0){
                int temp = nums[fast];
                nums[fast]= nums[slow];
                nums[slow]= temp ;
                slow++;
            }
        }
    }
}
