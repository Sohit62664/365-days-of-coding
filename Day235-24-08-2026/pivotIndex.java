class Solution {
    public int pivotIndex(int[] nums) {
        // findout pivot
        int n= nums.length ;

        int [] pre = new int[n];

        int [] suf = new int[n];

        for(int i =1 ; i< n ; i++){
            pre[i] = pre[i-1] + nums[i-1];
            int j = n-i-1 ;
            suf[j]= suf[j+1] + nums[j+1];
        }

        for(int i =0 ; i< n ; i++){
            if(pre[i]== suf[i]){
                return i;
            }
        }

        return -1;

        
    }
}
