package Day28;

public class Number_of_Ways_to_Paint_N_by_3_Grid {
    class Solution {
        int MOD = 1000000007;

        public int numOfWays(int n) {
            if (n == 0)
                return 0;

            long two = 6, three = 6; // Choices of colors To be use(2 or 3 ) and no. of combination
            n--;

            while (n > 0) {
                long nextTwo = (3 * two + 2 * three) % MOD;
                three = (2 * two + 2 * three) % MOD;
                two = nextTwo;
                n--;
            }

            return (int) (two + three) % MOD;

        }
    }

}
