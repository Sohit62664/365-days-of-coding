package Day28;

import java.util.HashSet;

public class N_Repeated_Element_in_Size_2N_Array {

}

class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (set.contains(n)) {
                return n;
            } else {
                set.add(n);
            }
        }

        return 0;
    }
}