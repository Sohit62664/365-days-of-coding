class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        //Second largest 
        // Approach 1 : sort and get second distinict last
        
        // Approach 2 if no duplicate allowed
        
        int first = -1 ; 
        int second = -1 ;
        
        for(int num : arr){
            if(num > first){
                second = first ;
                first = num ;
            }
            
            if(num>second && num != first){
                second = num ;
            }
        }
        return second;
        
    }
}
