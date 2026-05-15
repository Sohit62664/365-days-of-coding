// User function Template for Java

class Solution {

    public long countSubArrayProductLessThanK(long arr[], int n, long k) {
        long p = 1 ; 
        long count=0 ;
        
        for(int st = 0 ,end = 0 ; end<n ; end++){
            p*=arr[end];
            while(p>=k && st<end){
                p/=arr[st++];
            }
            
            if(p<k){
                int len = end-st+1;
                count+=len;
            }
        }
        
        return count;
        
    }
}
