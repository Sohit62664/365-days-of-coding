class Solution {
    public int maxWater(int arr[]) {
        // code here
        // Naive Approach 
        
        // find max in the left 
        // find max in the right
        // compute the trapped water at the index = min(left , right)-height of the index 
        int ans =0 ;
        
        int n= arr.length;
        
        for(int i =0 ; i< n ; i++){
            int left = arr[i];
            
            for(int j = 0 ; j< i ; j++){
                left = Math.max(left , arr[j]);
            }
            
            
            int right = arr[i];
            
            for(int j = i ; j< n ; j++){
                right = Math.max(right , arr[j]);
            }
            
            ans += Math.min(left , right) - arr[i];
        }
        
        return ans;
    }
}
