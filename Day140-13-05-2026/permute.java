// class Solution {

//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         helper(nums, 0 , ans);
//         return ans;
//     }

//     public void helper(int [] nums , int idx , List<List<Integer>> ans){
//         int n= nums.length;
//         if(idx == n ){
//             ArrayList<Integer> temp = new ArrayList<>();
//             for (int val : nums) temp.add(val);
//             ans.add(temp);
//             return;
//         }

//         for(int i = idx ; i< n ; i++){
//             //swapping 
//             int temp = nums[idx]; 
//             nums[idx]= nums[i];
//             nums[i]= temp;
//             // recursive call
//             helper(nums , idx+1 , ans);
//             //backtracking 
//             int temp2 = nums[idx];
//             nums[idx]= nums[i];
//             nums[i]= temp2;
//         }

//     }
// }

// class Solution {
//     public List<List<Integer>> permute(int[] nums) {

//     }

//     static ArrayList<String> permutation(String p , String up, ArrayList<String> ans){
//         if(up.isEmpty()){
//             ans.add(p);
//             return ans;
//         }

//         char ch = up.charAt(0);

//         for(int i = 0 ; i<= p.length(); i++){
//             String first = p.substring(0, i);
//             String second  = p.substring(i, p.length());

//             permutation(first + ch + second, up.substring(1), ans);
//         }

//         return ans;
//     }
// }

class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        helper(nums, 0);
        return ans;
    }

    void helper(int [] nums , int i ){
        if(i == nums.length){
            ArrayList<Integer> list = new ArrayList<>();
            for(int num : nums){
                list.add(num);
            }
            ans.add(list);
            return;
        }

        for(int j = i ; j< nums.length ; j++){
            // swap 
            swap(nums , i , j);
            helper(nums , i+1 );

            swap(nums , i , j);
        }
    }

    void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
