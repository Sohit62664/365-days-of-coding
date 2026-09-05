// Brute Force Approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Brute Force Approach

        int ans [] = new int[nums.length];

        for(int i =0 ; i < nums.length ; i++){
            int product = 1 ;

            for(int j = 0 ; j< nums.length ; j++){
                if(i!=j){
                    product*= nums[j];
                }
            }

            ans[i]= product;
        }

        return ans ;
    }
}





// Optimal Approach 


class Solution {
    public int[] productExceptSelf(int[] nums) {

        int suffix[]= new int[nums.length];
        suffix[nums.length-1]= nums[nums.length-1];
        for(int j = nums.length-2 ; j>= 0 ; j--){
            suffix[j] = nums[j]* suffix[j+1];
        }


        int lp = 1 ;

        int ans[] = new int[nums.length];

        for(int i=0 ;i < nums.length-1 ;i++){
            ans[i] = lp*suffix[i+1];
            lp *= nums[i];
        }

        ans[nums.length-1] = lp; 


        return ans;
    }
}
