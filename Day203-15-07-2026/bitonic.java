class Solution {
    public int bitonic(int[] arr) {
        // code here
        int max = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            int left = i ;
            int right = i+1 ;
            int count = 0 ;
            while(left > 0 && arr[left]>=arr[left-1]){
                count++;
                left--;
            }
            
            while(right<arr.length && arr[right]<=arr[right-1]){
                count++;
                right++;
            }
            
            max = Math.max(count , max);
        }
        
        return max+1;
    }
}
