class Solution {
    public int singleNumber(int[] nums) {
        // String str = "";
        int ans = 0 ;

        for(int i = 31 ; i>=0 ; i--){
            int cnt = 0;
            for(int num : nums ){
                if((num & (1<<i) ) != 0 ){
                    cnt++;
                }
            }
            if(cnt% 3 == 1 ){
                ans = ans | (1<<i);
            }
        }
        
        // return Integer.parseInt(str , 2 );  // can't parse Negative Numbers
        return ans;
    }
}
