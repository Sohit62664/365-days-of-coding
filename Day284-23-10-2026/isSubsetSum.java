class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        
        return helper(n-1 , sum , arr);
    }
    static boolean helper( int  i , int target , int [] arr){
        // base case 
        if(target == 0 ) return true;
        if(i ==0 ) return arr[i]== target;
        
        //nottake
        
        boolean not_take = helper(i-1, target , arr);
        
        boolean take = false;
        
        if(arr[i]<= target){
             take = helper(i-1, target- arr[i], arr);
        }
        
        return not_take || take;
    }
}




class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        
        
        boolean dp[][] = new boolean[n][sum+1];
        for(int i =0 ; i< n ; i++){
            dp[i][0] = true;
        }
        
        
        if(arr[0] <= sum){
            dp[0][arr[0]] = true;
        }
        
        
        for(int i= 1 ; i< n ; i++){
            for(int t = 1 ; t <= sum ; t++){
                //not take 
                boolean not_take = dp[i-1][t]; // is the sum t possible to make by the prvious if i do not take 
                
                boolean take = false;
                if(arr[i] <= t){
                    take =dp[i-1][t-arr[i]] ;
                }
                
                dp[i][t] = not_take||take ;
                
            }
        }
        
        return dp[n-1][sum];
        
        // return helper(n-1 , sum , arr);
    }
    
    
    static boolean helper( int  i , int target , int [] arr){
        // base case 
        if(target == 0 ) return true;
        if(i ==0 ) return arr[i]== target;
        
        //nottake
        
        boolean not_take = helper(i-1, target , arr);
        
        boolean take = false;
        
        if(arr[i]<= target){
             take = helper(i-1, target- arr[i], arr);
        }
        
        return not_take || take;
    }
}
