class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ls = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    ls.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // remove duplicate from left 

                    while (left < right && left < n && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // remove duplicate from right
                    while (left < right && right + 1 < n && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }

            }
        }

        return ls;
    }
}
