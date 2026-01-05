package Day18;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Missing_number {
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> ans = new ArrayList<>();
            int i = 0;
            while (i < nums.length) {
                int correctindex = nums[i] - 1;

                if (nums[i] != nums[correctindex]) {
                    swap(nums, i, correctindex);
                } else {
                    i++;
                }
            }

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != j + 1) {
                    ans.add(j + 1);
                }
            }

            return ans;
        }

        public void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
}
