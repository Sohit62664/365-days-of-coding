// class Solution {
//     public int maxRotateFunction(int[] nums) {
//         int k = nums.length - 1 ;
//         rotate(nums , k);

//         int ans = 0 ;

//         for(int i = 0 ; i<= k ; i++){
//             ans+= (i* nums[i]);
//         }
        
//         return ans;
//     }

//     public void rotate(int[] nums, int k) {
//         List<Integer> list = new ArrayList<>();
//         for(int i = 0 ; i< nums.length; i++){
//             list.add(nums[i]);
//         }
//         Collections.rotate(list, k);
//         for(int i = 0 ; i< nums.length; i++){
//             nums[i] = list.get(i);
//         }
//         return;
//     }
// }


// class Solution {
//     public int maxRotateFunction(int[] nums) {
//         int k = nums.length - 1;

//         int ans = 0;

//         for (int i = 1; i <= k; i++) {
//             int max = 0;
//             rotate(nums, i);
//             for(int j = 0 ; j< k+1 ; j++){
//                 max+= (j* nums[i]);
//             }
//             ans = Math.max(ans,  max);
//         }
//         return ans;

//     }

//     public void rotate(int[] nums, int k) {
//         List<Integer> list = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             list.add(nums[i]);
//         }
//         Collections.rotate(list, k);
//         for (int i = 0; i < nums.length; i++) {
//             nums[i] = list.get(i);
//         }
//         return;
//     }
// }


class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;

        long sum = 0;
        long F = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            F += (long) i * nums[i];
        }

        long ans = F;

        for (int k = 1; k < n; k++) {
            F = F + sum - (long) n * nums[n - k];
            ans = Math.max(ans, F);
        }

        return (int) ans;
    }
}
