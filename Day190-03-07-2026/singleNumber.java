//XOR Properties
//a ^ a = 0
//a ^ 0 = a
//XOR is commutative and associative, so the order doesn't matter.

//This means every number that appears twice cancels itself out, leaving only the single number.

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0 ;
        for(int num : nums){
            result^= num ;
        }
        return result ; 
    }
}


// Approach 2 
//detect is pre == curr then make them 0 , so in the array all will become 0 except the single
// specitial case if 0 , 1 ,1 , 2, 2 -> upadated = 0 , 0 , 0 , 0, 0  -> if all zeros then return 0 -> it mence the 0 is non Repeating 

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);


        for(int i = 1 ; i<nums.length ; i++ ){
            int pre = nums[i-1];
            int curr = nums[i];

            if(pre== curr){
                nums[i-1] = 0 ;
                nums[i]= 0 ;
            }
        }

        for(int num : nums){
            if(num != 0){
                return num ;
            }
        }

        return 0 ;
    }
}
