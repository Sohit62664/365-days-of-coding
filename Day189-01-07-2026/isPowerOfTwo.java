class Solution {
    public boolean isPowerOfTwo(int n) {

        return check(n);  // Little bit Slower O(log n)
    }



    boolean check(int n){
        if(n == 1 ) return true;
        if(n <= 0 ) return false;
        if(n%2 == 0){
            return check(n/2); 
        }else{
            return false;
        }
        
    }
}





class Solution {
    public boolean isPowerOfTwo(int n) {

        // return check(n);  // Little bit Slower O(log n)

        // Using bit manupuLATION Faster Approach O(n)
        return n > 0 && (n & (n-1))== 0 ;

    }



    // boolean check(int n){
    //     if(n == 1 ) return true;
    //     if(n <= 0 ) return false;
    //     if(n%2 == 0){
    //         return check(n/2); 
    //     }else{
    //         return false;
    //     }
        
    // }
}
