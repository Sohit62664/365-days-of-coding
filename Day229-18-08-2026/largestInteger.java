class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        int max = -1;

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);

        }

        if (k == 1) {
            for (int x : nums) {
                if (map.get(x) == 1) {
                    max = Math.max(max, x);
                }
            }
            return max;
        } else if (k == n) {
            for (int x : nums) {

                max = Math.max(max, x);
            }
            return max;
        }else{
            
            if(map.get(nums[0])== 1){
                max = nums[0];
            }
            if(map.get(nums[n-1]) == 1){
                max= Math.max(nums[n-1] , max);
            }

            return max ;
        }

    }
}
