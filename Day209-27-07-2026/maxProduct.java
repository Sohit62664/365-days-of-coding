// Method 01
class Solution {
    public int maxProduct(int[] nums) {
        
        Arrays.sort(nums);
        int first = nums[nums.length-1]-1 ;
        int second = nums[nums.length-2]-1;
        return first * second ;        
    }
}


// Method 02 

class Solution {
    public int maxProduct(int[] nums) {

        int first = 0;
        int second = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num >= first) {
                second = first;
                first = num;
            } else if (num > second) {
                second = num;
            }
        }

        return (first - 1) * (second - 1);

    }
}


