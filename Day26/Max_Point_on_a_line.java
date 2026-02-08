package Day26;

import java.util.HashMap;
import java.util.Map;

public class Max_Point_on_a_line {
    class Solution {

        // Logic :If multiple points have same slope, then they lie in same line with
        // base

    public int maxPoints(int[][] points) {
        int max_same = 1;
        for (int i = 0; i < points.length; i++) {
            int n = same_slope(points[i], points);
            max_same = Math.max(n , max_same);
        }
        return max_same;
    }

        private int same_slope(int[] base, int[][] points) {
            Map<String, Integer> map = new HashMap<>();
            int overlap = 0, vertical = 0, localMax = 0;

            for (int[] p : points) {
                int dx = p[0] - base[0];
                int dy = p[1] - base[1];

                if (dx == 0 && dy == 0) {

                    overlap++;
                } else if (dx == 0) {

                    vertical++;
                    localMax = Math.max(localMax, vertical);
                } else {
                    int g = gcd(dx, dy);
                    dx /= g;
                    dy /= g;

                    String slope = dy + "/" + dx;
                    map.put(slope, map.getOrDefault(slope, 0) + 1);
                    localMax = Math.max(localMax, map.get(slope));
                }
            }

            return localMax + overlap;
        }

        private int gcd(int a, int b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }

    }
}
