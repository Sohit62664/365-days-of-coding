package Day8;

public class Find_the_Duplicate_Number {
    class Solution {
        public int findDuplicate(int[] nums) {
            // m1 sort th array O(n log n ) and find out the dupliates

            // can create A hash set and get the check whether the element is containing or
            // not if containing then return the number , but it taks O(n) extra space

            // optimal solution
            // detect a cycle and then return the head of the cycle

            int slow = 0, fast = 0;
            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while (slow != fast);

            slow = 0;
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }

            return slow;
        }
    }

}
