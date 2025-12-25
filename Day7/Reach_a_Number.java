public class Reach_a_Number {
    class Solution {
        public int reachNumber(int target) {
            // int S= (target*(target+1))/2;

            for (int i = 1;; i++) {
                int S = (i * (i + 1)) / 2;
                if (S >= Math.abs(target) && (S - Math.abs(target)) % 2 == 0) {
                    return i;
                }
            }
        }
    }
}
