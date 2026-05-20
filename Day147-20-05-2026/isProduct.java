class Solution {
    public boolean isProduct(int[] arr, long target) {
        // code here
        // Brute Force Approach
        int n = arr.length;
        for(int i =0 ; i< n ; i++){
            for(int j = i+1 ; j< n ; j++){
                long product = arr[i]* arr[j];
                if(product == target) return true;
                
            }
        }
        
        return false;
    }
}
