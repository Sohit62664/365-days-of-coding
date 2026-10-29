// Using Sorting 


class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums );
        int n= nums.length ;
        int num1 = nums[0];
        int num2 = nums[n-1] ;
        boolean first = false ;
        for(int i = 1 ; i< n ; ){
            int curr = nums[i];
            int pre = nums[i-1];

            if(curr!= pre && !first){
                num1 = pre; 
                first = true ;
                i++;
                continue;                
            }

            if(curr!= pre && first){
                num2 = pre; 
                i++;
                continue; 
            }

            i+=2 ;
        }

        return new int[]{num1, num2};
    }
}




//Optimize Approach


class Solution {
    public int singleNumber(int[] nums) {
        int ones =0 ; 
        int twos = 0; 

        for(int i =0 ; i< nums.length ; i++){
            ones = (nums[i] ^ ones) & (~twos);
            twos = (nums[i] ^ twos) & (~ones);
        }

        return ones;
    }
}
