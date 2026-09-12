class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1 ;
        int n = nums.length ;

        for(int i=1 ; i< nums.length ; i++){
        int c= 1;
            while(i< n && nums[i] < nums[i-1] ){
                c++;
                i++;
            } 

            max = Math.max(max , c);
        }

        for(int i=1 ; i< nums.length ; i++){
        int d= 1;
            while( i < n && nums[i] > nums[i-1] ){
                d++; 
                i++;
            }

            max = Math.max(max , d);
        }

        return max;


    }
}
