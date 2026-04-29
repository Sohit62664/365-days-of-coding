class Solution {
    public int minSwaps(int[] arr) {
        // code here
        int  ones = 0 ;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]==1){
                ones++;
                
            }
        }
        if(ones == 0){
            return -1;
        }
        //window Size is total ones
        int zeros= Integer.MAX_VALUE ;
        // int i =0 ;
        // while(i+ones <= arr.length){
        //     int zero_count = 0 ;
        //     for(int j = i ; j< i+ones ;j++ ){
        //         if(arr[j ]== 0){
        //             zero_count++;
        //         }
        //     }
        //     zeros = Math.min(zeros , zero_count);
        //     i++;
        // }
        
        // Sliding Window approach 
        
        int i = 0 ; int j = 0 ;
            int zerocount = 0 ;
        while(j<arr.length){
            if(arr[j]== 0){
                zerocount++;
            }
            if((j-i+1)> ones){
                if(arr[i]!=1){
                    zerocount--;
                    // i++;
                }
                i++;
            }
            if((j - i + 1) == ones){
                zeros = Math.min(zeros, zerocount);
            }
            
            j++;
        }
        
        return zeros ;
    }
}




//O(n^2)
class Solution {
    public int minSwaps(int[] arr) {
        // code here
        int  ones = 0 ;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]==1){
                ones++;
                
            }
        }
        if(ones == 0){
            return -1;
        }
        //window Size is total ones
        int zeros= Integer.MAX_VALUE ;
        int i =0 ;
        while(i+ones <= arr.length){
            int zero_count = 0 ;
            for(int j = i ; j< i+ones ;j++ ){
                if(arr[j ]== 0){
                    zero_count++;
                }
            }
            zeros = Math.min(zeros , zero_count);
            i++;
        }
        
        return zeros ;
    }
}
