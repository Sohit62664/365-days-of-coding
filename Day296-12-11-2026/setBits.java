class Solution {
    public int setBits(int n) {
        // code here
        // int cnt = 0 ;
        // while(n!= 0){
            
        //     n = n& n-1;
        //     cnt++;
        // }
        
        // return cnt ;
        
        
        int set = 0 ; 
        
        for(int i =0  ; i < 31 ; i++){
            if((n & (1 << i )) != 0) set++;
        }
        return set;
    }
}
