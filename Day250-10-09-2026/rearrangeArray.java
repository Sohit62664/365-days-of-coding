class Solution {
    public int[] rearrangeArray(int[] nums) {
        // using extra space 
        int n = nums.length;
        int [] neg = new int[n/2];
        int [] pos = new int[n/2];

        int p =0 ;
        int ne = 0 ; 

        for(int i =0 ; i< n ; i++){
            if(nums[i]>=0){
                pos[p]= nums[i];
                p++;
            }else{
                neg[ne]= nums[i];
                ne++;
            }
        }

        p= 0 ;
        ne = 0 ; 

        for(int i =0 ; i< n ; i++){
            if(i%2 == 0 ){
                nums[i]= pos[p];
                p++;
            }else{
                nums[i]= neg[ne];
                ne++;
            }
        }

        return nums;


    }
}




// a little optimize one 
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length ;
        int pos =0 ;
        int neg =  1 ;

        int ans []= new int[n];
        for(int i =0 ; i< n ; i++){
            if(nums[i]>=0){
                ans[pos] = nums[i];

                pos+=2 ;
            }else{
                ans[neg] = nums[i];

                neg+=2 ;
            }
        }

        return ans ;
    }
}
