class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;

        
        int j =0 ;

        for(int i =0 ; i< n ; i++){
            if(nums[j]!= 0){
                j++;
            }else if(nums[i]!=0 && nums[j]==0){
                swap (i , j , nums);
                j++;
            }
        }


    }
    public void swap(int i , int j , int [] nums){
        int temp = nums[i]; 
        nums[i] = nums[j];
        nums[j]= temp;
    }
}







class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
        int i =0 ; 
        int j = 0 ; 

        while(i < n ){
            if(nums[j]!= 0){
                j++;
            }else if(nums[i]!= 0 && nums[j]==0) {
                swap(i, j , nums);
                j++;
            }
            i++;
        }
        

    }
    public void swap(int i , int j , int [] nums){
        int temp = nums[i]; 
        nums[i] = nums[j];
        nums[j]= temp;
    }
}
