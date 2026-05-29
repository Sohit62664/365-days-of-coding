class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        // limit the Occurrence
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                int x = Math.min(k, count);
                limit(ans, x, nums[i - 1]);
                count = 1;
            } else {
                count++;
            }
        }
        
            int x = Math.min(k, count);
            limit(ans, x, nums[nums.length - 1]);
        

        int n = ans.size();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = ans.get(i);
        }

        return arr;
    }

    void limit(ArrayList<Integer> ans, int k, int num) {
        for (int i = 0; i < k; i++) {
            ans.add(num);
        }
        return;
    }
}
