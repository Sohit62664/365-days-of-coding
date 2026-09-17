class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            set.add(x);
        }

        int longest = 0;

        for (int x : set) {
            int current = x;

            int max = 0;

            if (!set.contains(current + 1)) {
                while (set.contains(current)) {
                    max++;
                    current = current - 1;
                }
            }
            longest = Math.max(max, longest);

        }

        return longest;
    }
}
