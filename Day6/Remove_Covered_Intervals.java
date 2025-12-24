package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_Covered_Intervals {
    class Solution {
        public int removeCoveredIntervals(int[][] intervals) {
            List<int[]> answer = new ArrayList<>();

            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
            int count = 0;// number of covered
            for (int i = 0; i < intervals.length; i++) {
                if (answer.isEmpty()) {
                    answer.add(intervals[i]);
                } else if (answer.get(answer.size() - 1)[0] == intervals[i][0]
                        && answer.get(answer.size() - 1)[1] <= intervals[i][1]) { // checking for special cace of
                                                                                  // covered [1,4],[1,8] -> [1,8]
                    count++;
                    answer.get(answer.size() - 1)[1] = intervals[i][1];
                } else if (answer.get(answer.size() - 1)[0] <= intervals[i][0] &&
                        answer.get(answer.size() - 1)[1] >= intervals[i][1]) { // checking for covered ifboth of the
                                                                               // first element is not equal
                    count++;
                    continue;
                } else {
                    answer.add(intervals[i]);// not covered then push
                }
            }

            return intervals.length - count; // numer of elements after removing the covered
        }

    }

}
