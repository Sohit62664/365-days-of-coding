// class Solution {
//     public int concatenatedBinary(int n) {
//         int ans = 1;
//         for(int i = 2 ; i<= n ; i++){
//             int bit_length= Integer.toBinaryString(i).length();
//             ans*= Math.pow(2 , bit_length);
//             ans+=i;
//             ans %= (Math.pow(10,9) + 7);
//         }

//         return ans;
//     }
// }


class Solution {
    public int concatenatedBinary(int n) {
        long ans = 1;
        long mod = 1_000_000_007;

        for (int i = 2; i <= n; i++) {

            int bitLength = 32 - Integer.numberOfLeadingZeros(i);

            ans = ((ans << bitLength) % mod + i) % mod;
        }

        return (int) ans;
    }
}