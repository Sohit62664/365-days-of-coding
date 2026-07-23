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
