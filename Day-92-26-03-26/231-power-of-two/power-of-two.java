class Solution {
    public boolean isPowerOfTwo(int n) {
        return check( n);
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