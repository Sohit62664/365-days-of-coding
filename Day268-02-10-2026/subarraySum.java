
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0 ;
        int n = nums.length; 

        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        int count =0 ; 
        for(int i =0 ; i< n ;i++){
            sum += nums[i];
            int key = sum-k;

            if(map.containsKey(key)){
                count+=map.get(key);
            }

            // storing the sum we can get the sum of the subarrys 

            map.put(sum , map.getOrDefault(sum , 0)+1 );
        }

        return count;
    }
}
