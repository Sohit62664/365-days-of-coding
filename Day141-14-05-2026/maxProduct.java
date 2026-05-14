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



// optimized approach 

class Solution {
    int maxProduct(int[] arr) {
        // code here
        // Using Suffix , Prifix Approach  or simillar to Array Preprocessing
        
        int suff=1;
        int pre = 1;
        
        
        int max_product = arr[0]; // or Integer.MAX_VALUE
        int n = arr.length;
        
        for(int i =0  ; i< n ; i++){
            if(suff == 0) suff= 1 ;
            if(pre == 0) pre = 1 ;
            
            suff*= arr[i] ;
            pre *= arr[n-i-1];
            
            max_product= Math.max(max_product , Math.max(suff , pre));
        }
        
        return max_product;
    }
}
