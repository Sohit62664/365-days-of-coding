public class GfG {

    public static int LongestMountain(ArrayList<Integer> arr) {

        int n = arr.size();

        if (n < 3)
            return 0;

        int ans = 0;

        for (int i = 1; i <= n - 2;) {

            if (arr.get(i) > arr.get(i - 1)
                    && arr.get(i) > arr.get(i + 1)) {

                int count = 0;

                int j = i;

                while (j > 0
                        && arr.get(j) > arr.get(j - 1)) {

                    count++;
                    j--;
                }

                while (i <= n - 2
                        && arr.get(i) > arr.get(i + 1)) {

                    count++;
                    i++;
                }

                ans = Math.max(ans, count);

            } else {
                i++;
            }
        }

        if (ans > 0)
            return ans + 1;

        return ans;
    }
