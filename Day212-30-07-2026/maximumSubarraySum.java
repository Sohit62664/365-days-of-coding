class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum  = 0 ;
        long max_sum = 0 ;
        
        HashSet<Integer> set = new HashSet<>();
        int i = 0 ;
        for(int j =0 ; j < nums.length ; j++){
            //go untill the nums[j]isn't unique 

            while(set.contains(nums[j])){
                set.remove(nums[i]);
                sum-= nums[i];
                i++;
            }

            //adding new element
            sum+= nums[j];
            set.add(nums[j]);


            if(j-i +1  == k){
                max_sum = Math.max(max_sum , sum);
                
                set.remove(nums[i]);
                sum-= nums[i];
                i++; 
            }
            

        }

        return max_sum;

    }
}
