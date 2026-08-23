class Solution {
    public int firstMissingPositive(int[] nums) {
        //Problem --> the ans will always lies with in 1 to nums.length ;
        // Broute Force Approach 
        HashMap<Integer , Boolean> map = new HashMap<>();
        for(int i= 1 ; i<= nums.length ; i++){
            map.put(i , false);
        }

        for(int i= 0 ; i< nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , true);
            }
        }

        for(int i = 1 ; i<= nums.length ; i++){
            if(map.get(i)== false){
                return i ;
            }
        }

        

        return -1 ;
    }
}
