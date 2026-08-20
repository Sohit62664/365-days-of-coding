class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        recurse(nums, 0);
        return ans;
    }

    void recurse(int nums[] , int i ){
        if(i == nums.length){
            // System.out.println(Arrays.toString(nums));
            List<Integer> list = new ArrayList<>();

            for(int num : nums){
                list.add(num);
            }
            ans.add(list);
            return;
        }

        for(int j = i ; j< nums.length ; j++){
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j]= temp;

            recurse(nums, i+1);
            //backtrack
            temp = nums[i];
            nums[i]= nums[j];
            nums[j]= temp;

        }
    }
}




//Vs code implimentation 


import java.util.Arrays;

public class permutation {

    static void permute(int nums[] , int i ){
        if(i == nums.length){
            System.out.println(Arrays.toString(nums));
            return;
        }

        for(int j = i ; j< nums.length ; j++){
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j]= temp;

            permute(nums, i+1);
            //backtrack
            temp = nums[i];
            nums[i]= nums[j];
            nums[j]= temp;

        }
    }

    public static void main(String[] args) {
        int nums[]= {1,2,3};
        permute(nums, 0);
    }
}
