class Solution {
    
    // int count =0 ;
    public int minOperation(int n) {
        // code here
        
        
        return f(n , 0 ) ;
    }
    
    int f (int n ,int  count){
        
        if(n== 0) return 0 ; 
        
        if(n == 1 ) return 1 ;
        
        if(n == 2 )  return 2 ;
        
        if( n== 3 ) return 3 ;
        
        if(n % 2 == 0){
            n/= 2;
            return count+ 1 + f(n , count);
        }else{
            return count+1 + f(n-1 , count);
        }
    }
}
