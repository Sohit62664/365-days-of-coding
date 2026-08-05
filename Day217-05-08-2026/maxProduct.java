class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0]; 
        int ans = nums[0]; 


        for(int i = 1 ; i< nums.length ; i++){
            if(nums[i]< 0){
                int temp = max ;
                max = min ;
                min = temp ;
            }

            max = Math.max(nums[i] , nums[i]* max); //if nums[i] is negative then it's already updated to minimum now both negative will produce maximum ;
            min = Math. min(nums[i] , nums[i]* min); // since min is already updated if nums[i] is negative then we have the maximum value in the min aftwer mutiplication it will produce minimum value 
            
            ans = Math.max(max , ans);
        }

        return ans ;

    }
}
