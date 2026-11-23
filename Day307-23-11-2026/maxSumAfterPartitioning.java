class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length; 

        return f(0 , arr , k);
    }
    int f(int i , int [] arr , int k){
        if(i >= arr.length){
            return 0 ;
        }
        int max = arr[i];
        int sum = 0;
        for(int j = i ; (j < i + k) && (j < arr.length) ; j++){
            max = Math.max(max , arr[j]);
            int len = j-i+1;
            int cost = (len * max) + f(j+1 , arr , k);
            sum = Math.max(cost , sum);
        }
        return sum ;
    }
}


// Memoization 
class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length; 
        int dp[] = new int[n+1];
        Arrays.fill(dp , -1);
        return f(0 , arr , k , dp );
    }
    int f(int i , int [] arr , int k , int [] dp){
        if(i >= arr.length){
            return 0 ;
        }
        if(dp[i] != -1) return dp[i]; // signifies --> what is the maximum sum i can get till the index i after partitioning 
        int max = arr[i];
        int sum = 0;
        for(int j = i ; (j < i + k) && (j < arr.length) ; j++){
            max = Math.max(max , arr[j]);
            int len = j-i+1;
            int cost = (len * max) + f(j+1 , arr , k , dp);
            sum = Math.max(cost , sum);
        }
        return dp[i] = sum ;
    }
}


//Tabulation
class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int dp[] = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            int max = arr[i];
            int sum = 0;
            for (int j = i; j < i + k && j < n; j++) {
                max = Math.max(max, arr[j]);
                int len = j - i + 1;
                int cost = (len * max) + dp[j + 1];
                sum = Math.max(cost, sum);
            }
            dp[i] = sum;
        }
        return dp[0];
    }
}
