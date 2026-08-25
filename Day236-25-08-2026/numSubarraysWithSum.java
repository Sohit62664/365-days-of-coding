class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // return the count of the subarray havving some equals goal
        HashMap<Integer, Integer> map = new HashMap<>();
        //sum , frquency

        int sum = 0 ; 
        int count = 0 ;
        map.put(0 , 1);
        for(int i =0 ; i < nums.length; i++){
            sum+=nums[i];
            int key = sum- goal;
            if(map.containsKey(key)){
                count+= map.get(key);

            }

            map.put(sum , map.getOrDefault(sum , 0)+1);
        }

        return count;
    }
}
