class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // sum of the subarray should be multiplication of k;
        // 0 is always a multiple of k
        // sum = n * k -> sum%k == 0 ; 


        HashMap<Integer, Integer> map = new HashMap<>();
        //remainder , index

        //neever forget to initialize the map 
        map.put(0, -1);

        int sum = 0 ;

        for(int i =0 ; i< nums.length ; i++){
            sum+= nums[i];
            int rem = sum%k;
            
            goo
            if(map.containsKey(rem)){
                if(i-map.get(rem)>=2){
                    return true;
                }
            }

            map.putIfAbsent(rem , i);
        }


        return false ;

    }
}
