// Using bit manupulation

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans =  new ArrayList<>();

        int subset = 1 << (nums.length);

        for(int num = 0 ; num < subset ; num++){
            List<Integer> ls = new ArrayList<>();

            for(int i = 0 ; i< nums.length ; i++){
                if((num & (1<< i) ) != 0 ){
                    ls.add(nums[i]);
                }
            }
            ans.add(ls);
        }

        return ans ;
    }
}

// Recursive Solution 

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        // Using Recursion

        List<Integer> ls = new ArrayList<>();

        helper(0 , ls, nums);
        return ans;
    }

    void helper(int i , List <Integer> ls , int [] nums){
        if(i == nums.length){
            List<Integer> result = new ArrayList<>(ls);
            ans.add(result);
            return ;
        }

        ls.add(nums[i]);
        helper(i+1 , ls , nums);
        ls.remove(ls.size()-1);
        helper(i+1 , ls , nums);

        
    }
}
