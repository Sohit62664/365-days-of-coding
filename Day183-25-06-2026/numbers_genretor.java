class Solution {

    public static ArrayList<Integer> increasingNumbers(int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (n == 1) {
            for (int i = 0; i <= 9; i++) {
                ans.add(i);
            }
            return ans;
        }

        if (n > 10) return ans;

        generate(ans, n, 1, 0, 0);
        return ans;
    }

    static void generate(ArrayList<Integer> ans, int n, int start, int len, int num) {
        if (len == n) {
            ans.add(num);
            return;
        }

        for (int d = start; d <= 9; d++) {
            generate(ans, n, d + 1, len + 1, num * 10 + d);
        }
    }
}