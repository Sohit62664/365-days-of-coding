class Solution {
    public int minimumDifference(int[] nums, int k) {

        int n = nums.length;
        if (k == 1)
            return 0;
        Arrays.sort(nums);
        int i = 0;
        int j = k - 1;

        if (n >= k)
            j = k - 1;
        else
            j = n - 1;

        int temp=0;
        int min = nums[j];
        while(j<n){
            temp = nums[j]-nums[i];
            min=Math.min(temp , min);
            j++;
            i++;

        }
        return min;

    }
}