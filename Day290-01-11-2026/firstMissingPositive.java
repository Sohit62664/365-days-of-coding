class Solution {
    public int firstMissingPositive(int[] nums) {
        //O(n) Extra Space

        HashSet<Integer> set = new HashSet<>();
        if(nums.length == 1){
            if(nums[0] == 0 ) return 1 ; 
            if(nums[0]== 1 ) return 2;
        }
        for(int num : nums){
            if(num > 0 && num <= nums.length){
                set.add(num);
            }
        }

        for(int i=1  ; i <= nums.length+1 ; i++){
            if(!set.contains(i)){
                return i ;
            }
        }

        return -1 ;
    }
}
