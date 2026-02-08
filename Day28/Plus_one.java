package Day28;

public class Plus_one {
    class Solution {
        public int[] plusOne(int[] digits) {

            int n = digits.length;
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                } else {
                    digits[i] = 0;
                }
            }

            // if some how the nummber become 000 then 999+1 = 1000;
            int[] ans = new int[n + 1];
            ans[0] = 1;
            return ans;

        }
    }
}
