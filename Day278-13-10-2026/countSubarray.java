class Solution {
    public int countSubarray(int[] arr, int k) {
        // code here
        int left = 0 ;
        if(k == 1) return 0 ;
        int p = 1 ; 
        int count= 0 ;
        for(int r =0 ; r < arr.length ; r++){
            p *= arr[r];
            while(p >= k){
                p= p/arr[left];
                left++;
            }
            if(p < k){
                 count+= r- left+1;
            }
        }
        
        return count; 
    }
}
