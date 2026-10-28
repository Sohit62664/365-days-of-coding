class Solution {
    public int singleNumber(int[] nums) {
        int num = nums[0];

        for(int i =1 ; i< nums.length ; i++){
            num^= nums[i];
        }

        return num;
    }
}




// Without using Xor , But tooks extra space
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0 ; i< nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+ 1 );
        }

        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }

        return -1 ;
    }
}


// Third Approach is Sort the Array and discard the pairs whenever you found the pre != curr  , i.e. curr is the single one
