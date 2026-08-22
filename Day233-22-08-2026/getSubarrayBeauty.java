class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
         int n = nums.length;
        int ans[] = new int[n - k + 1];

        int freq[] = new int[50];

        for (int i = 0; i < k; i++) {
            if (nums[i] < 0) {
                freq[nums[i] + 50]++;
            }
        }

        for (int i = 0; i <= n - k; i++) {
            int count = 0;
            ans[i] = 0;

            for (int j = 0; j < 50; j++) {

                count += freq[j];

                if (count >= x) {
                    ans[i] = j - 50;
                    break;
                }

            }

            // slide the window

            if (i + k < n) {

                // remove the ith and update it's freq
                if (nums[i] < 0) {
                    freq[nums[i] + 50]--;
                }

                // next element
                if (nums[i + k] < 0) {
                    freq[nums[i+k] + 50]++;
                }

            }
        }

        return ans;
    }
}
