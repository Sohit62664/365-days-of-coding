package Day26;

public class candy {

    class Solution {
        public int minCandy(int arr[]) {

            int n = arr.length;
            // code here
            int candies[] = new int[n];
            for (int i = 0; i < n; i++) {
                candies[i] = 1;
            }

            // L->R pass
            for (int i = 1; i < n; i++) {

                if (arr[i] > arr[i - 1])
                    candies[i] = candies[i - 1] + 1;

            }

            // R->L
            for (int i = n - 2; i >= 0; i--) {

                if (arr[i] > arr[i + 1])
                    candies[i] = Math.max(candies[i], candies[i + 1] + 1);

            }

            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans += candies[i];
            }
            return ans;
        }
    }

}
