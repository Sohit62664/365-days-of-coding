class Solution {
    public void sortColors(int[] nums) {
        // method 01 
        // Solving via Dutch Flag algoritnim 
        // it is An Algorithim Which is used to Sort three Colors in an array , it is an in Place Sorting technique


        // while mid <= high
        // Step1 make three pointer low , mid initialized with 0 , high initialize with end -1 ;
        // Step 2 -check if arr[mid] == 0 then swap it with low position , increment low , mid ;

        // Step 3  if arr[mid]== 1 then increment mid by 1 
        // Step 4 if 2 then swap it with high , mid  And decrement high by 1 ;

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 0 ){
                // Swap 
                int temp = nums[low];
                nums[low]= nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                // swap
                int temp = nums[high];
                nums[high]= nums[mid];
                nums[mid] = temp ;
                high--;
            }
        }
        return ;

        // Method 02 ;
        // Sorting  without inbuilt Sortfunction 
        // 1. Make three Array and 1-> 0 , 2-> 1 , 3-> 2
        // replace the element of the orignal with these array element;
        // O(n), Space and time 

        // ArrayList<Integer> a0 = new ArrayList<>();
        // ArrayList<Integer> a1 = new ArrayList<>();
        // ArrayList<Integer> a2 = new ArrayList<>();

        // for(int i = 0 ; i < nums.length ; i++){
        //     if(nums[i]==0){
        //         a0.add(0);
        //     }else if(nums[i]==1){
        //         a1.add(1);
        //     }else{
        //         a2.add(2);
        //     }
        // }

        // int count_0 = a0.size();
        // int count_1 = a1.size();
        // int count_2 = a2.size();
        // int j=0;
        // for(int i =0 ; i< count_0 ; i++){
        //     nums[j]=0;
        //     j++;
        // }        
        // for(int i =0 ; i< count_1 ; i++){
        //     nums[j]=1;
        //     j++;
        // }
        // for(int i =0 ; i< count_2 ; i++){
        //     nums[j]=2;
        //     j++;
        // }
        // return;

    }
}
