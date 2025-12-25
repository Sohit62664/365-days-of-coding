public class Maximum_Value_at_a_Given_Index_in_a_Bounded_Array {
    // "maximize/minimize X that satisfies Y", it's often Binary Search

    class Solution {
        public int maxValue(int n, int index, int maxSum) {

            int emptyR = n - 1 - index;
            int emptyL = index;

            int h = maxSum, l = 1;
            int res = 0;

            while (l <= h) {
                int mid = l + (h - l) / 2;

                long leftSum = 0, rightSum = 0;
                long el = mid - 1;

                // Right side
                if (emptyR <= el) {
                    rightSum = (el * (el + 1)) / 2
                            - ((el - emptyR) * (el - emptyR + 1)) / 2;
                } else {
                    rightSum = (el * (el + 1)) / 2 + (emptyR - el);
                }

                // Left side
                if (emptyL <= el) {
                    leftSum = (el * (el + 1)) / 2
                            - ((el - emptyL) * (el - emptyL + 1)) / 2;
                } else {
                    leftSum = (el * (el + 1)) / 2 + (emptyL - el);
                }

                long sum = leftSum + mid + rightSum;

                if (sum <= maxSum) {
                    res = mid;
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
            return res;
        }
    }

}
