class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Goal is to Findout all the tripilits having sum = 0 ;

        int n = nums.length ;
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        for (int i  = 0 ; i< n-2 ; i++){


            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }


            int num = nums[i];
            int left = i+1 ; 
            int right = n-1;
            while(left<right){


                int sum = nums[i] ;
                sum+= nums[left];
                sum += nums[right];

                if(sum == 0 ){
                    ans.add(Arrays.asList(nums[i] , nums[left] , nums[right]));

                    while(right > left && nums[right] == nums[right-1]){
                        right--;
                    }

                    while(right> left && nums[left]== nums[left+1]){
                        left++;
                    }

                    left++;
                    right--;
                    
                }else if(sum <0){
                    left++;
                }else if(sum> 0){
                    right--;
                }

                
            }
        }

        return ans ;
    }
}
