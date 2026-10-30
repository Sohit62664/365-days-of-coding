class Solution {
    public int countStaircase(int[] nums) {
        int n = nums.length;
        int count=0 ;   
        for(int i=0 ; i < n ; i++){
            for(int j =i ; j < n ; j++){
                if(valid(i , j , nums)){
                    count++;
                }
            }
        }
        return count;
    }

    boolean valid(int i , int j , int[] nums){


        LinkedHashMap<Integer ,Integer> map  = new LinkedHashMap<>();

      
        for(int k = i ; k <= j ; k++){
            map.put(nums[k] , map.getOrDefault(nums[k] , 0) +1);            
        }
        int k = 1 ;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() != k){
                return false ;
            }
            k++;
        }

        return true ;
    }
}
