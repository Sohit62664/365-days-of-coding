package Day10;

import java.util.ArrayList;
import java.util.List;

public class Permuttation {
    class Solution {

        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            helper(nums, 0, ans);
            return ans;
        }

        public void helper(int[] nums, int idx, List<List<Integer>> ans) {
            int n = nums.length;
            if (idx == n) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int val : nums)
                    temp.add(val);
                ans.add(temp);
                return;
            }

            for (int i = idx; i < n; i++) {
                // swapping
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                // recursive call
                helper(nums, idx + 1, ans);
                // backtracking
                int temp2 = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp2;
            }

        }
    }
}
