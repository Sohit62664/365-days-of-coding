package Day8;

public class Koko_Eating_Bananas {
    class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int st = 1;
            int end = 0;

            for (int p : piles) {
                end = Math.max(end, p);
            }

            int ans = end;
            while (st <= end) {
                int mid = st + (end - st) / 2;

                long hours = 0;
                for (int p : piles) {

                    // we cann Also use ceil formula from math collectio

                    // ceil division is ceil(a / b) = (a + b - 1) / b

                    // hours += (p + mid - 1) / mid;

                    if (p % mid == 0) {
                        hours += p / mid;
                    } else {
                        hours += (p / mid) + 1;
                    }
                }

                if (hours <= h) {
                    ans = mid;
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }

            }
            return ans;
        }
    }

}
