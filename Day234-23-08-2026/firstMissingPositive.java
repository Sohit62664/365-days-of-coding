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



//Updated one but space complexity is over their even it is Accepted 
class Solution {
    public int firstMissingPositive(int[] nums) {
        //Problem --> the ans will always lies with in 1 to nums.length ;
        // Broute Force Approach 
        HashMap<Integer , Boolean> map = new HashMap<>();
        for(int i= 1 ; i<= nums.length+1 ; i++){
            map.put(i , false);
        }

        for(int i= 0 ; i< nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , true);
            }
        }

        for(int i = 1 ; i<= nums.length + 1 ; i++){
            if(map.get(i)== false){
                return i ;
            }
        }



        return -1 ;
    }
}









// Optimize Approach
class Solution {
    public int firstMissingPositive(int[] nums) {
        int st = 1 ;
        int end = nums.length;


        if(end==1){
            if(nums[0]!= 1){
                return 1 ;
            }else{
                return 2;
            }
        }
        //clean the array
        for(int i = 0 ;  i< nums.length ; i++){
            if(nums[i] > end){
                nums[i]= end+4;
            }

            if(nums[i]<=0){
                nums[i]= end+4;
            }
        }

        //Marking Negative
        for(int i =0 ;i< nums.length ; i++){
            int val = Math.abs(nums[i]);
            if(val>=1 && val<= end)
            nums[val-1]= -Math.abs(nums[val-1]);
        }

        for(int i =0 ; i < nums.length ; i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return end+1;


    }
}


