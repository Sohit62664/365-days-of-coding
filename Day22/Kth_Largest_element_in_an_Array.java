package Day22;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kth_Largest_element_in_an_Array {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < nums.length; i++) {
                pq.add(nums[i]);
            }

            ;
            int i = 1;
            while (i <= k) {
                if (i == k) {
                    return pq.poll();
                }
                pq.poll();
                i++;
            }
            return -1;
        }
    }
}
