public class Longest_Consecutive {
    class Solution {
        public int longestConsecutive(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            if (nums.length == 0)
                return 0;
            for (int num : nums) {
                set.add(num);
            }

            int longest = 0;

            for (int x : set) {
                if (!set.contains(x - 1)) {
                    int current = x;
                    int count = 1;

                    while (set.contains(current + 1)) {
                        count++;
                        current++;

                    }
                    longest = Math.max(count, longest);
                }
            }
            return longest;
        }
    }
}
