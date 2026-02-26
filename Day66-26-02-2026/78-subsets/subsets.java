// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {

//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> list = new ArrayList<>();

//         for (int num : nums) {
//             list.add(num);
//         }

//         printer(ans, list, new ArrayList<>());
//         return ans;
//     }

//     List<List<Integer>> printer(List<List<Integer>> ans , List<Integer> nums){
//         if(nums.size()==0) return ans;
//         nums.remove(0);
//         printer(ans.add(nums.get(0)) , nums);
//         printer(ans ,  nums);
//     }
// }

import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        printer(ans, list, new ArrayList<>());
        return ans;
    }

    List<List<Integer>> printer(List<List<Integer>> ans,
            List<Integer> nums,
            List<Integer> current) {

        if (nums.size() == 0) {
            ans.add(new ArrayList<>(current));
            return ans;
        }

        int first = nums.get(0);

        List<Integer> remaining = new ArrayList<>(nums);
        remaining.remove(0);

        current.add(first);
        printer(ans, remaining, current);

        current.remove(current.size() - 1);
        printer(ans, remaining, current);

        return ans;
    }
}