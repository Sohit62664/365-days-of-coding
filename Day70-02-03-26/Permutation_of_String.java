
class Solution {
    
    
    
     public ArrayList<String> findPermutation(String s) {

        ArrayList<String> ans = new ArrayList<>();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);   // Important for duplicate handling
        boolean[] used = new boolean[arr.length];

        backtrack(arr, used, new StringBuilder(), ans);
        return ans;
    }
    
    
    static void backtrack(char[] arr, boolean[] used,
                          StringBuilder temp, ArrayList<String> ans) {

        if (temp.length() == arr.length) {
            ans.add(temp.toString());
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            // Skip already used characters
            if (used[i]) continue;

            // Skip duplicates
            if (i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            temp.append(arr[i]);

            backtrack(arr, used, temp, ans);

            // Backtrack
            temp.deleteCharAt(temp.length() - 1);
            used[i] = false;
        }
    }
}
