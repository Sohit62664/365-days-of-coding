// by Sorting

class Solution {
    public int singleNumber(int[] nums) {
        // Using The Shorting

        Arrays.sort(nums);
        int n = nums.length; 
        if(n == 1) return nums[0];
        for(int i =0 ; i < nums.length- 3  ; i+=3 ){
            // int pre = nums[i-1];
            int curr = nums[i];
            int next = nums[ i+1];
            // int nextnext = nums[i+ 2];

            if(curr!= next){
                return curr;
            }
        }

        return nums[n-1];
    }
}



// using Hashmp Extra space 
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

