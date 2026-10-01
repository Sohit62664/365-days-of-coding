// class Solution {
//     public int minOperations(int[] nums) {

//         int zero = 0;
//         int ones = 0;

//         int n = nums.length;

//         for(int i = 0; i < n; i++){
//             if(nums[i] == 0){
//                 zero++;
//             }else{
//                 ones++;
//             }
//         }

//         if(zero < 3) return -1;

//         int count = 0;

//         for(int i = 0; i < n; i++){

//             // Skip 1's
//             while(i < n && nums[i] == 1){
//                 i++;
//             }

//             // now i is pointing to 0

//             int j = i;

//             if(i < n && nums[i] == 0){

//                 // Cannot flip if fewer than 3 elements remain
//                 if(i + 3 > n) return -1;

//                 count++;

//                 // Flip exactly three
//                 while(i < j + 3){
//                     if(nums[i] == 0){
//                         nums[i] = 1;
//                     }else{
//                         nums[i] = 0;
//                     }
//                     i++;
//                 }

//                 i = j;
//             }
//         }

//         return count;
//     }
// }



class Solution {
    public int minOperations(int[] nums) {

        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++){

            // If current element is already 1, skip it
            if(nums[i] == 1){
                continue;
            }

            // Current element is 0
            // We need 3 elements to flip
            if(i + 3 > n){
                return -1;
            }

            count++;

            // Flip exactly 3 elements
            for(int j = i; j < i + 3; j++){
                nums[j] = nums[j] == 0 ? 1 : 0;
            }
        }

        return count;
    }
}
