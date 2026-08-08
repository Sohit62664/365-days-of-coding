
// by this approach we canot get the corrwect output because we loose the index of that charecter 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1; 

        Arrays.sort(nums);
        while(left < right){
            int sum = nums[right]+ nums[left] ;

            if(sum == target ){
                return new int[]{left , right};
            }else if(sum < target){
                left++;
            }else{
                right--; 
            }
        }

        return new int[]{-1,-1};
    }
}


// implemnted correct Hashmap Approacch 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0 ; i< nums.length ; i++){
            int comp = target-nums[i];
            if(map.containsKey(comp)){
                return new int []{i , map.get(comp)};
            }else{
                map.put(nums[i] , i);
            }
        }
        return new int[]{-1, -1};
    }
}
