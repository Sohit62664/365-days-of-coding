class Solution {
    public boolean isPowerOfFour(int n) {
        return check(n);
    }
    boolean check(int n){
        if(n == 1 ) return true;
        if(n <= 0 ) return false;
        if(n% 4 == 0){
            return check(n/4); 
        }else{
            return false;
        }
        
    }
}