class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer > map = new HashMap<>();


        for(int i =0 ; i< nums.length ; i++){
            int v = nums[i];
            int comp = target-v;
            if(map.containsKey(comp)){
                return new int []{i , map.get(comp)};
            }

            map.put(v, i );
        }

        return new int[]{-1,-1};

    }
}
