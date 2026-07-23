class Solution {
    public int uniqueXorTriplets(int[] nums) {
        //brute force approach 
        // genrate all triplits O(n^3) and take xor of all 

        int  n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i< n ; i++){
            for(int j = i ; j< n ; j++){
                for(int k = j ; k < n ; k++){
                    int xor = nums[i] ^ nums[j]^ nums[k];
                    set.add(xor);
                }
            }
        }

        return set.size();
    }
}



// optimized approach 




// class Solution {
//     public int uniqueXorTriplets(int[] nums) {

//         // genrate all triplits wil always cost O(n^3) so we can't genrate all the triplites 
//         // the clue we have given is the number is permutation from 1 to n 
//         //minimum n possible way n = array Size 
//         //how to get others 
//         //testing each triplits will always cost O(n^3) then what to do ?
//         //we need somehing where we no need to check each and everyone 

//         // Hint 1 What is the maximum and minimum value we can obtain using the given numbers? 

//         //how this hint is releted ? 

//     }
// }

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        //brute force approach 
        // genrate all triplits O(n^3)

        int n = nums.length;
        if (n == 2) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else {
            int msb_index = msb(n) + 1;
            double ans = Math.pow(2, msb_index);
            


            return (int) ans;
        }

    }

    int msb(int n) {
        for (int i = 31; i >= 0; i--) {
            int mask = 1 << i;

            if ((n & mask) != 0) {
                return i;
            }
        }
        return -1;
    }

}
