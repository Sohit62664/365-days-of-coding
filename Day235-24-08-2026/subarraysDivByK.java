class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // The problem is count the number of subarray whose sum is divisible by k 

// LOGIC BEHIND this is that --> if two sum are praducing the same remainder then their diff(new subarray) must be divisible by k
        int sum = 0;
        int count  =0 ;
        HashMap<Integer , Integer> map = new HashMap<>();
        // remainder , frequency
        

        map.put(0, 1);

        for(int i =0 ; i< nums.length ; i++){
            sum += nums[i];
            int rem = sum%k;
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem , map.getOrDefault(rem , 0)+1);
        }

        return count;

    }
}
