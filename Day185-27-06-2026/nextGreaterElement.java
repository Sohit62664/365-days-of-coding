class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // brute force
        /*
        for each element in nums1 find it int nums2 and check the next grreter if
        it is then add to the ans else add -1
        */

        //Emplimentation 

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ;i < nums1.length ; i++){
            int num1 = nums1[i];
            //search on nums2

            for(int j = 0 ; j< nums2.length ; j++){
                if(nums2[j]==num1){
                    boolean added = false;
                    for(int k = j+1 ; k <nums2.length ; k++){
                        if(nums2[j] < nums2[k]){
                            ans.add(nums2[k]);
                            added = true;
                            break ;
                        }
                    }
                    if(!added){
                        ans.add(-1);
                    }
                }
            }
        }

        int [] result= new int[ans.size()];

        for(int i =0 ; i< ans.size() ; i++){
            result[i]= ans.get(i);
        }

        return result;
    }
}
