package Day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_of_arrays_I {

    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);

            ArrayList<Integer> list = new ArrayList<>();

            int i = 0;
            int j = 0;
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    if (list.size() == 0 || list.get(list.size() - 1) != nums1[i]) { // Checking the last Added element
                                                                                     // is the same as the upcoming
                        list.add(nums1[i]);
                    }
                    i++;
                    j++;
                } else if (nums1[i] > nums2[j]) {
                    j++;
                } else {
                    i++;
                }
            }

            int[] answer = new int[list.size()];
            for (int k = 0; k < list.size(); k++) {
                answer[k] = list.get(k);
            }

            return answer;
        }
    }
}