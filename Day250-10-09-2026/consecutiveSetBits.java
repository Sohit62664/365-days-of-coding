class Solution {
    public boolean consecutiveSetBits(int n) {
        int count= 0 ; 
        for(int i =0 ; i< 32 ; i++){
            if(((1<<i) & n)!= 0  && ((1<<i+1)& n)!= 0 ){
                count++;
            }
        }

        if(count==1) {
            return true ;
        }else{
            return false ;
        }
    }
}
