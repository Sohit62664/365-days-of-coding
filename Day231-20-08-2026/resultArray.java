class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        // first opration first in a1 , second in a2 
        // third operation last a1 > last a2 then add third element in a1 else in a2 

        arr1.add(nums[0]);
        arr2.add(nums[1]);
        
        for(int i = 2 ; i< nums.length ; i++){
            int l1 = arr1.get(arr1.size()-1);
            int l2 = arr2.get(arr2.size()-1);
            if(l1> l2){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }
        int i = 0 ;
        for(int x : arr1){
            nums[i]= x;
            i++;
        }
        for(int x : arr2){
            nums[i]= x;
            i++;
        }


        return nums;
    }
}
