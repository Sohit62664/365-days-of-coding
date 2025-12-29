package Day11;

import java.util.HashMap;
import java.util.Map;

public class Find_Duplicate_element {
    // class Solution {
    // public int findDuplicate(int[] nums) {
    // //m1 sort th array O(n log n ) and find out the dupliates

    // // can create A hash set and get the check whether the element is containing
    // or not if containing then return the number , but it taks O(n) extra space


    
    // // optimal solution
    // //detect a cycle and then return the head of the cycle

    // int slow = 0 , fast =0;
    // do{
    // slow = nums[slow];
    // fast = nums[nums[fast]];
    // }while(slow!=fast);

    // slow = 0;
    // while(slow!=fast){
    // slow = nums[slow];
    // fast = nums[fast];
    // }

    // return slow ;
    // }
    // }

    // With the help of hashset

    class Solution {
        public int findDuplicate(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    return entry.getKey();
                }
            }
            return -1;
        }
    }
}
