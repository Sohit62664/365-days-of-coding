package Day17;

public class Missing_number {
    class Solution {
        public int missingNumber(int[] nums) {

            int i = 0;
            while (i < nums.length) {
                int correct = nums[i];
                if (correct == nums.length) {
                    i++;
                } else if (nums[correct] != nums[i]) {
                    swap(nums, correct, i);
                } else {
                    i++;
                }
            }

            for (int j = 0; j < nums.length; j++) {
                if (j != nums[j]) {
                    return j;
                }
            }
            return nums.length;
        }

        public void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
}
