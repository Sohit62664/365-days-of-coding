package Day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_of_arrays_II {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            // Similar to the Intersection of Two Arrays I but no need to remove the
            // duplicates

            int i = 0, j = 0;
            Arrays.sort(nums1);
            Arrays.sort(nums2);

            ArrayList<Integer> list = new ArrayList<>();
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    i++;
                    j++;
                } else if (nums1[i] > nums2[j]) {
                    j++;
                } else {
                    i++;
                }
            }

            int[] ans = new int[list.size()];
            for (int k = 0; k < list.size(); k++) {
                ans[k] = list.get(k);
            }

            return ans;
        }
    }
}
