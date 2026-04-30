class Solution {
    // public void rotate(int[] nums, int k) {
    //     int n = nums.length;
    //     k = k % n;
    //     reverse(nums, 0, n - 1);
    //     reverse(nums, 0, k - 1);
    //     reverse(nums, k, n - 1);
    // }

    // public int[] reverse(int[] nums, int i, int j) {
    //     while (i < j) {
    //         int temp = nums[i];
    //         nums[i] = nums[j];
    //         nums[j] = temp;
    //         i++;
    //         j--;
    //     }
    //     return nums;
    // }

    // public void rotate(int[] nums, int k) {
    //     int n = nums.length;
    //     k = k % n;
    //     if (k == 0)
    //         return;

    //     int[] ans = new int[n];
    //     int i = 0;
    //     int j = n - k;

    //     for (; i < k; i++) {
    //         ans[i] = nums[j];
    //         j++;

    //     }
    //     for (int m = 0; m < n - k; m++) {
    //         ans[i] = nums[m];
    //         i++;
    //     }

    //     for (int m = 0; m < n; m++) {
    //         nums[m] = ans[m];
    //     }
    //     return;
    // }

    public void rotate(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i< nums.length; i++){
            list.add(nums[i]);
        }
        Collections.rotate(list, k);
        for(int i = 0 ; i< nums.length; i++){
            nums[i] = list.get(i);
        }
        return;
    }
}
