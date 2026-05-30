class Solution {
    public int countKthRoots(int l, int r, int k) {
        // return number of y by which x^k = y is in range
        // tell me all the number which having the power k themn the result lies within the Range  

        // lowest ans is l , max is r 
        // take the k root of the min 

        // edge case
        if (k == 1) {
            return r - l + 1;
        }

        int lb = (int) Math.ceil(Math.pow(l, 1.0 / k)- 1e-9 );
        int ub = (int) Math.floor(Math.pow(r, 1.0 / k)+1e-9);

        if (lb <= ub)
            return ub - lb + 1;

        return 0;
    }

}
