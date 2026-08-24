// similar to genrate nth Catalan number 




class Solution {
    public int prefixStrings(int n) {
        // code here
        //  a string is valid if it contain exactly n ones and n zeros such that every prefix of the string contains at least as many ones as zeros.
        // It must contain exactly n ones and n zeros.
        // For every prefix,
        // number of 1s ≥ number of 0s
        
        // restatate --> how many Valid number of pernthesis uppyou can genrate using n ones , nzeros 
        
        // Catalan numbers
        int mod = 1000000000+7;
        long c = 1 ; //c0  catalon numbers
        for(int i =1; i <= n ; i++){
            c= c*2 *(2 * i -1);
            c= c*  inverse(i+1 , mod);
            
            c = c% mod;
        }
        
        return (int) c ;
        
        
    }
    long inverse(long x, long mod) {
        long power = mod - 2;
        long result = 1;

        while(power > 0) {

            if(power % 2 == 1) {
                result = result * x % mod;
            }

            x = x * x % mod;
            power = power / 2;
        }

        return result;
    }
    
    
}





