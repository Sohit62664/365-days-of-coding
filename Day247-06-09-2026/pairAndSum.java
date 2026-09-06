class Solution {
    public long pairAndSum(int[] arr) {
        // code here
        //Brute Force approach 
        int sum = 0;
        for(int i =0 ; i< arr.length ; i++){
            
            for(int j = i+1 ; j< arr.length ; j++){
                if(i<j){
                    sum+= arr[i] &arr[j];
                }
            }
        }
        return sum ;
    }
}





class Solution {
    public long pairAndSum(int[] arr) {
        // code here
        
        
        long ans = 0 ;
        for(int bit =0 ; bit< 31 ; bit++){
            
            // check sepratly for each  is it set or not in each number 
            int count = 0 ; 
            
            for(int num : arr){
                if((num & (1 << bit))  != 0 ){
                    count++;
                }
            }
            
            // now calculate how many pair having the set bit in the total of count set bit number 
            // Which is nothing bot the combinaton   count C 2 
            
            long  pairs = (long) count*(count-1 )/2;
            
            // now what is the total contribution of each pairs 
            
            ans+= pairs* (1L<<bit); // using 1L because of log
        }
        
        return ans;
    }
}
