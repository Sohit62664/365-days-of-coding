class Solution {
    public long maximizeSum(int[] nums, int k) {

        long sum =0 ;
        int n = nums.length;
        int gain[] = new int[n];
        for(int i =0 ; i< n ; i++){
            int g = max(nums[i]) -  nums[i];
            gain[i] = Math.max(g , 0);            
        }

        Arrays.sort(gain);

        // int(i =n-1 )
        for(int i =n-1 ; i>=(n-k ) ; i--){
            sum+= gain[i];
        }           

        for(int i =0 ; i< n ; i++){
            sum+= nums[i];
        }
        return sum;
    }


    int max(int n){
        String s = String.valueOf(n);

        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        int num = 0 ;
        for(int i = ch.length-1 ; i>= 0 ; i--){
            num*= 10 ;
            num+=(ch[i]-'0');
        }
        return num;
    }
}
