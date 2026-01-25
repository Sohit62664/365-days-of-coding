class Solution {
    int findWays(int n) {
        // code here
        if (n % 2 == 1) return 0;
        int k = n/2;
        long a = factorial(2*k);
        long b= factorial(k+1)*factorial(k);
        
        return (int)(a/b);
        
    }
    
    static long factorial(long x) {
        long res = 1;
        for (long i = 2; i <= x; i++) res *= i;
        return res;
    }
}
