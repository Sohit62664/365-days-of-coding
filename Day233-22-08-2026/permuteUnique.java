class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    HashSet<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        permut2(nums, 0);
        return ans;

    }

    void permut2(int[] digits, int i) {
        if (i == digits.length) {

            // List<Integer> list = new ArrayList<>(Arrays.asList(digits));
            List<Integer> list = new ArrayList<>();

            for (int x : digits) {
                list.add(x);
            }

            if (set.add(list)) {
                ans.add(list);
            }

            return;
        }

        for (int j = i; j < digits.length; j++) {
            int temp = digits[i];
            digits[i] = digits[j];
            digits[j] = temp;

            permut2(digits, i + 1);

            temp = digits[i];
            digits[i] = digits[j];
            digits[j] = temp;
        }

    }
}
