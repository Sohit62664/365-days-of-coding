class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    int atMost(int[] nums, int k) {
        int count= 0 ;
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size()>k) {
                int l = nums[left];
                map.put(l, map.getOrDefault(l, 0) - 1);
                if (map.get(l) == 0) {
                    map.remove(l);
                }
                left++;
            }
            count+= right-left+1 ;
        }

        return count+1;
    }
}
