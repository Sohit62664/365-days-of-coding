class Solution {
    
    int max(int a , int b , int c ){
        return Math.max(Math.max(a,b) , c);
    }
    
    int min(int a , int b , int c ){
        return Math.min(Math.min(a,b) , c);
    }
    
    
    int maxProduct(int[] arr) {
        // code here
        int curr_min = arr[0];
        int curr_max = arr[0];
        int max_prod = arr[0] ;
        
        for(int i =1 ; i< arr.length ;i++){
            
            int temp  = max(arr[i] , arr[i]* curr_min , arr[i] * curr_max);
            curr_min = min(arr[i] , arr[i]* curr_min , arr[i] * curr_max);
            
            curr_max = temp; // we creatwe A teemp Becauce if we update first thenn it is possible  that the value of cuu_max at the index will change this will change the curr_min 
            
            max_prod= Math.max(curr_max, max_prod);
        }
        
        return max_prod;
        
    }
}
