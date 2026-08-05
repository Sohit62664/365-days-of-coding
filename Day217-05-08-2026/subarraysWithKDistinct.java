class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // bruteforce ->
        //findout all the subarray and get the count 

      //Using map and exactly k trick

        return (atMost(nums ,k) - atMost(nums , k-1));
    }

    int atMost(int [] nums , int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        int left =0 , count = 0 ;

        for(int right = 0 ;  right<nums.length ; right++){
            map.put(nums[right] , map .getOrDefault(nums[right] , 0)+1);

            while(map.size()> k){
                map.put(nums [left] , map.get(nums[left]) -1 );
                if(map.get(nums[left])== 0){
                    map.remove(nums[left]);
                }
                left++;
            }

            count+= right-left+1 ;
        }

        return count  ;

    }
}
