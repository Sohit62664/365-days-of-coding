class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int Duplicate = 0;
        int sum = 0;
        int n = nums.length;
        int t_sum= (n*(n+1))/2;
        for(int x: nums){
            if(!set.contains(x)){
                set.add(x);
                sum+=x;
            }else{
                Duplicate = x;
            }
        }
        int missing = t_sum - sum;

        return new int[]{Duplicate, missing};
        
    }
}