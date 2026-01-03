import java.util.HashMap;

public class maxEqualRowsAfterFlips {
    class Solution {
        public int maxEqualRowsAfterFlips(int[][] matrix) {
            HashMap<String, Integer> map = new HashMap<>();

            for (int[] row : matrix) {
                StringBuilder st = new StringBuilder();

                // normalize row
                if (row[0] == 0) {
                    for (int val : row) {
                        st.append(val);
                    }
                } else {
                    for (int val : row) {
                        st.append(1 - val);
                    }
                }

                String key = st.toString();

                map.put(key, map.getOrDefault(key, 0) + 1);

            }

            int max = 0;
            for (Integer v : map.values()) {
                if (v > max) {
                    max = v;
                }
            }
            return max;
        }
    }

    // logic :
    // Normalaizing each row and if it starts with 0 then no need to flip otherwice
    // flip the rowe ->
    // Normalaizing mence we are making similar row with the help of flipping

}
