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




//4D Dp

class Solution {
    public static int longestBitonicSequence(int n, int[] nums) {
        // code here
        int  dp [][][][] = new int[n][n+1][2][2];
        // int dp[][][][] = new int[n][n + 1][2][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k < 2; k++) {
                    Arrays.fill(dp[i][j][k], -1);
                }
            }
        }
        
        
        int ans = f(0 , -1 , 1 , nums , n  , 0 , dp);
        
        return (ans < 0) ? 0 : ans;
    }
    
    static int f(int i , int pre ,int inc , int[] arr , int n  , int hasInc  , int [][][][] dp){
        
        if(i == n ){
            return (inc == 0 && hasInc == 1) ? 0 : -100000 ;
        }
        if(dp[i][pre+1][inc][hasInc] != -1)   return dp[i][pre+1][inc][hasInc] ;
        int np = f(i+1 , pre , inc , arr , n  , hasInc , dp);
        int pi = -100000 ;
        
        if(inc == 1){
            //either go with increasing order 
            if(pre == -1 || arr[i] > arr[pre]){
                pi = 1 + f(i+1 , i , 1 , arr , n , 1 , dp);
            }
            //either choose decreasing 
            
            if(pre != -1 && arr[i] < arr[pre] &&hasInc==1){
                int pii = 1 + f(i+1 , i , 0 , arr , n , hasInc, dp);
                
                pi = Math.max(pi , pii);
            }
        }else{
            if(arr[i] < arr[pre]){
                int pii = 1 + f(i+1 , i , 0 , arr, n , hasInc, dp);
                pi = Math.max(pi , pii);
            }
        }
        
        return dp[i][pre+1][inc][hasInc] = Math.max(np , pi);
        
    }
}




// Standard tabulize approach 

class Solution {
    public static int longestBitonicSequence(int n, int[] nums) {
        // code here
        
        int ldp [] = new int [n];
        int rdp [] = new int [n];
        Arrays.fill(ldp , 1);
        Arrays.fill(rdp , 1);
        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j < i  ; j++){
                if(ldp[i] < 1 + ldp[j] &&  nums[i] > nums[j]){
                    ldp[i] = 1 + ldp[j];
                }
            }
        }
        
        
        for(int i = n-2 ; i >= 0  ; i-- ){
            for(int j = n-1 ; j > i ; j-- ){
                if(rdp[i] < 1 + rdp[j] &&  nums[i] > nums[j]){
                    rdp[i] = 1 + rdp[j];
                }
            }
        }
        
        int max = 0 ;
        for(int i = 1 ; i< n-1 ; i++){
            
            if(ldp[i] > 1 && rdp[i] > 1)
            max = Math.max(max,ldp[i] + rdp[i] - 1);
        }
        
        return max ;
    }
}

