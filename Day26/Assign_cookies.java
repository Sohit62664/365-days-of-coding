package Day26;

import java.util.Arrays;

public class Assign_cookies {
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            int content = 0;
            Arrays.sort(g);
            Arrays.sort(s);
            for (int i = 0; i < g.length; i++) {

                for (int j = 0; j < s.length; j++) {
                    if (s[j] >= g[i]) {
                        s[j] = -1;

                        content++;
                        break;
                    }
                }
            }
            return content;
        }
    }
}
