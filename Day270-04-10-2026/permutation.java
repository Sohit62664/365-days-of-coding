class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        return permutation(nums , 0 , ans);
    }

    List<List<Integer>> permutation(int [] nums , int index ,List<List<Integer>> ans ){
        if(index == nums.length){
            //got the permutation
            ArrayList<Integer> ls = new ArrayList<>();
            for(int x: nums){
                ls.add(x);
            }
            ans.add(ls);
            
            return ans;
        }

        for(int i = index ; i < nums.length ; i++){
            // i -->      What is i actually --> who is on the index postion 
            // index -->   orignal value of the index 

            int temp = nums[i];
            nums[i]= nums[index];
            nums[index] = temp;


            permutation(nums , index+1 , ans);

            temp = nums[i];
            nums[i]= nums[index];
            nums[index] = temp;
        }


        return ans;

    }
}
