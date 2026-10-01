class Solution {
    public int minKBitFlips(int[] nums, int k) {
        // What is the condition A t which we can say that it is not possible to make such subarray 
        // k> numuber of 0 

        // count no.of 0 , 1s 


        // 5 , 3 ones , 5(0)--> 1 2 flips

        // total no. of floips = contigious part of the array havig 0's 
        int zero = 0 ; 
        int ones =0 ; 

        int n= nums.length ;

        //edge cases 
        for(int i=0  ; i< n ; i++){
            if(nums[i]== 0){
                zero++;
            }else{
                ones++ ;
            }
        }

        if(k == 1) return zero;
        if(zero == 0) return 0 ;
        double t = n ;
        if(ones == n) return (int)Math.ceil(t/k) ;

        if(ones== 0 && k < n) return -1 ;

        if(zero<k) return -1 ;


        int set = -1 ; 
        int count = 0 ;
        int limit = 0 ;

        for(int i = 0 ; i< n ; i++){
            if(nums[i]== 0 ){
                count++;
            }
            while( i < n && nums[i]==0){
                i++;
                if(limit == k){
                    count++;
                    limit = 0 ;
                }
            }
        }
        return count;
    }
}
