// User function Template for Java
class Solution {
    public int[] commonSlot(List<int[]> a, List<int[]> b, int d) {

        a.sort(Comparator.comparingInt(arr -> arr[0]));
        b.sort(Comparator.comparingInt(arr -> arr[0]));

        int i = 0;
        int j = 0;

        while (i < a.size() && j < b.size()) {

            int st = Math.max(a.get(i)[0], b.get(j)[0]);
            int end = Math.min(a.get(i)[1], b.get(j)[1]);

            // overlap duration enough
            if ((end - st) >= d) {
                return new int[]{st, st + d};
            }

            // move smaller ending interval
            if (a.get(i)[1] < b.get(j)[1]) {
                i++;
            } else {
                j++;
            }
        }

        return new int[0];
    }
}
