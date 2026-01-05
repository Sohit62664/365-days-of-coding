package Day18;

public class Set_mismatch {
    class Solution {
        public int[] findErrorNums(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    // swap(nums , i , correct );
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                } else {
                    i++;
                }
            }
            // List<Integer> ans = new ArrayList<>();
            int[] ans = new int[2];

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != j + 1) {
                    // ans.add(j+1);
                    // ans.add(nums[j])
                    ans[0] = nums[j]; // Duplicate number
                    ans[1] = j + 1; // missing number
                }
            }
            return ans;
        }
    }
}
