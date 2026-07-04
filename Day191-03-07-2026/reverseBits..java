class Solution {
    public int reverseBits(int n) {
        int result = 0 ;
        for(int i = 0 ; i< 32 ; i++  ){
            // result = shift the Result and append the last bit of n 
            result = (result<< 1 ) | (n & 1);
            n >>= 1 ;

        }

        return result ;
    }
}

/*
Notes: 
The algorithm does exactly this:

Take the last bit of n.
Append it to the end of result.
Remove that last bit from n.
Repeat 32 times.


*/
