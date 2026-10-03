class Solution {
    public char findKthBit(int n, int k) {
        int length = (int) Math.pow(2, n) - 1;

        return helper(n, k, length);
    }

    char helper(int n, int k, int L) {
        if (n == 1)
            return '0';
        int mid = (int) Math.pow(2, n - 1) ;
        if (mid == k)
            return '1';

        else if (k < mid)
            return helper(n - 1, k, mid-1);
        else {
            int mirror = L-k +1 ;
            char t = helper(n-1 , mirror , mid-1);
            return t =='0' ? '1': '0' ;
        }
    }
}
