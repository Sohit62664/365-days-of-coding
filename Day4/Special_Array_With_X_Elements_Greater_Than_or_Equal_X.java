package Day4;

public class Special_Array_With_X_Elements_Greater_Than_or_Equal_X {
    // 1608. Special Array With X Elements Greater Than or Equal X

    class Solution {
        public int specialArray(int[] nums) {

            for (int i = 0; i <= nums.length; i++) {
                int count = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] >= i) {
                        count++;
                    }
                }
                if (count == i)
                    return i;
            }
            return -1;
        }
    }
}
