class Solution {
    public int firstMissingPositive(int[] nums) {
        //O(n) Extra Space

        HashSet<Integer> set = new HashSet<>();
        if(nums.length == 1){
            if(nums[0] == 0 ) return 1 ; 
            if(nums[0]== 1 ) return 2;
        }
        for(int num : nums){
            if(num > 0 && num <= nums.length){
                set.add(num);
            }
        }

        for(int i=1  ; i <= nums.length+1 ; i++){
            if(!set.contains(i)){
                return i ;
            }
        }

        return -1 ;
    }
}



class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && !(nums[i] <= 0 || nums[i] > n)) {
                if(nums[i] != nums[nu.ms[i]-1])
                swap(i, nums[i] - 1, nums);
                else break ;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1)
                return i + 1;
        }

        return n + 1;
    }

    void swap(int i, int j, int[] nums) {
        // int a = nums[i];
        // int b = nums[j];
        // never use this in that way bwecause you are Swaping the local Variables
        // a = a^b ;
        // b = a^b ;
        // a = a^b ;

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        return;
    }
}
