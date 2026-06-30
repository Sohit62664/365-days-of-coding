class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Using HashMap
        HashMap<Integer , Integer > map = new HashMap<>();
        int i =0 ;
        int [] ans ={-1,-1};
        for(int x: nums){
            int comp = target-x;
            if (map.containsKey(comp)){
                ans[0]= i ; ans[1]= map.get(comp);
                return ans;
            }

            map.put(x,i);
            i++;
        }

        return ans;
    }
}
