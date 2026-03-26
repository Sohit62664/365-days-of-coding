class Solution {
    public boolean isPowerOfThree(int n) {
        return check(n);

    }
    boolean check(int n){
        if(n == 1 ) return true;
        if(n <= 0 ) return false;
        if(n%3 == 0){
            return check(n/3); 
        }else{
            return false;
        }
        
    }
}