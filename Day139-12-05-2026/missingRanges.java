class Solution {
    int l;
    int u;

    public List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        l = lower;
        u = upper;

        List<List<Integer>> ans = new ArrayList<>();

        // starting range
        if (arr[0] > l && arr[0] <= u) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(l);
            list.add(arr[0] - 1);
            ans.add(list);
        }

        for (int i = 1; i < arr.length; i++) {

            // range
            if (!rang(arr[i]) && !rang(arr[i - 1]))
                continue;

            if (arr[i] - arr[i - 1] > 1) {
                ArrayList<Integer> list = new ArrayList<>();

                list.add(arr[i - 1] + 1);
                list.add(arr[i] - 1);

                ans.add(list); 
            }
        }

        // ending range
        if (u > arr[arr.length - 1]) {
            ArrayList<Integer> list = new ArrayList<>();

            list.add(arr[arr.length - 1] + 1);
            list.add(u);

            ans.add(list);
        }

        return ans;
    }

    boolean rang(int num) {
        return num >= l && num <= u;
    }
}
