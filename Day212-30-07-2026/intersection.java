class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();
        HashSet<Integer> ans_set= new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }

        for(int num : nums2){
            if(set.contains(num)){
                ans_set.add(num);
            }
        }

        int i = 0 ;
        int ans []= new int [ans_set.size()];
        for(int num : ans_set){
            ans[i]= num; 
            i++;
        }


        return ans ;

    }
}
