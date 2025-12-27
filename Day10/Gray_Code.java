package Day10;

import java.util.ArrayList;
import java.util.List;

public class Gray_Code {
    class Solution {
        public List<Integer> grayCode(int n) {
            List<Integer> result = new ArrayList<>();
            int size = 1 << n; // left Shift op x << k = x × 2^k

            for (int i = 0; i < size; i++) {
                result.add(i ^ (i >> 1)); // core formula to get the grycode
            }
            return result;
        }
    }
}
