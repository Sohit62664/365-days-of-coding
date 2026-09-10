class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n= arr.length;
        // int r = 
        
        for(int i = 0 ; i< n  ; i+= k ){
            
            int r = Math.min(i+k-1 , n-1);
            reverse( arr , i , r);
        }
        
    }
    
    
    void reverse(int [] num , int i , int j ){
            while(i< j){
                int temp = num[i];
                num[i]= num[j];
                num[j]= temp ;
                i++;
                j--;
            }
        }
}
