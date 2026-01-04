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

    // if the array Is not contains 0 then we can use this approach
    class Solution2 {
        int missingNum(int[] nums) {

            int i = 0;
            while (i < nums.length) {
                int correct = nums[i] - 1;

                if (correct < 0 || correct >= nums.length || nums[i] == nums[correct]) {
                    i++;
                } else {
                    swap(nums, i, correct);
                }
            }

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != j + 1) {
                    return j + 1;
                }
            }

            return nums.length + 1;
        }

        void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}
