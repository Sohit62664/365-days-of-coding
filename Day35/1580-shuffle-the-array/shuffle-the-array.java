class Solution {
    public int[] shuffle(int[] nums, int n) {
        // int [] ans= new int[nums.length];
        // int j= 0;
        // for(int i=0 ; i< n ; i++){
        //     ans[j++]= nums[i];
        //     ans[j++]=nums[n+i];
        // }
        // return ans;

        // int i = 0 ;
        
        int j = 0;
        int k = n;
        int [] ans = new int[2*n];
        for(int i =0; i< ans.length ; i+=2){
            ans[i]=nums[j];
            j++;
            ans[i+1]=nums[k];
            k++;
        }
        return ans;

    }
}