public class Kth_Missing_Positive_Number {
    class Solution {
        public int findKthPositive(int[] arr, int k) {
            // int missing_sum = arr[0] -1;
            // int missing_position = arr.length-1;
            // for (int i = 0; i < arr.length; i++) {
            // if (i + 1 < arr.length) {
            // missing_sum += (arr[i + 1] - arr[i] - 1);
            // }
            // if (missing_sum > k) {
            // missing_position = i;
            // break;
            // }
            // }
            // missing_sum -= k;
            // return arr[missing_position] + missing_sum;

            // by Binary search

            int st = 0;
            int end = arr.length - 1;
            while (st <= end) {
                int mid = st + (end - st) / 2;
                int missing = arr[mid] - (mid + 1);

                if (missing < k) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return st + k;

        }
    }

}
