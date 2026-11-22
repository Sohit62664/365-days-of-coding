class Solution {
    public static int longestBitonicSequence(int n, int[] nums) {
        // code here
        int ans = f(0 , -1 , 1 , nums , n  , 0);
        return (ans < 0) ? 0 : ans;
    }
    
    static int f(int i , int pre ,int inc , int[] arr , int n  , int hasInc ){
        
        if(i == n ){
            return (inc == 0 && hasInc == 1) ? 0 : -100000 ;
        }
        
        int np = f(i+1 , pre , inc , arr , n  , hasInc );
        int pi = -100000 ;
        
        if(inc == 1){
            //either go with increasing order 
            if(pre == -1 || arr[i] > arr[pre]){
                pi = 1 + f(i+1 , i , 1 , arr , n , 1 );
            }
            //either choose decreasing 
            
            if(pre != -1 && arr[i] < arr[pre] &&hasInc==1){
                int pii = 1 + f(i+1 , i , 0 , arr , n , hasInc);
                
                pi = Math.max(pi , pii);
            }
        }else{
            if(arr[i] < arr[pre]){
                int pii = 1 + f(i+1 , i , 0 , arr, n , hasInc);
                pi = Math.max(pi , pii);
            }
        }
        
        return Math.max(np , pi);
        
    }
}
