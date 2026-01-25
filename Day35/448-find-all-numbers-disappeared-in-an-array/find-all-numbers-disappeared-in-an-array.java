class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max= nums[0];
        for(int x : nums){
            set.add(x);
            max= Math.max(max, x);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1; i<= nums.length ; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}