package Day27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Maximum_Area_of_Fence {
    class Solution {
        static final long MOD = 1_000_000_007L;

        public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
            ArrayList<Integer> hf = new ArrayList<>();
            ArrayList<Integer> vf = new ArrayList<>();
            hf.add(1);
            for (int x : hFences)
                hf.add(x);
            hf.add(m);

            vf.add(1);
            for (int x : vFences)
                vf.add(x);
            vf.add(n);

            Collections.sort(hf);
            Collections.sort(vf);

            HashSet<Integer> hset = new HashSet<>();
            for (int i = 0; i < hf.size(); i++) {
                for (int j = i + 1; j < hf.size(); j++) {
                    hset.add(hf.get(j) - hf.get(i));
                }
            }

            long best = -1;
            // HashSet<Integer> vset = new HashSet<>();
            for (int i = 0; i < vf.size(); i++) {
                for (int j = i + 1; j < vf.size(); j++) {
                    int len = vf.get(j) - vf.get(i);
                    if (hset.contains(len)) {
                        best = Math.max(best, (long) len * len);
                    }
                }
            }

            if (best == -1) {
                return -1;
            }
            return (int) (best % MOD);

        }
    }
}
