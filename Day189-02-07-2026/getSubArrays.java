class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int start = 0; start < arr.length; start++) {

            List<Integer> current = new ArrayList<>();

            for (int end = start; end < arr.length; end++) {
                current.add(arr[end]);
                ans.add(new ArrayList<>(current));
            }
        }

        return ans;
    }
}
