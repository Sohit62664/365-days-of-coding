class Solution {
    public int kBitFlips(int[] arr, int k) {
        // code here
        // Brute Force 
        
        int res =0 ; 
        int n = arr.length;
        for (int i= 0 ; i< n-k +1; i++){
            if(arr[i] == 0){
                for(int j = i ; j< i+ k  ; j++){
                    arr[j]^=1 ; 
                }
                res++;
            }
        }
        // n - k + 1
        for(int i = 0  ; i< n ; i++){
            if (arr[i] == 0 ) return -1 ;
        }
        return res ; 
    }
}
