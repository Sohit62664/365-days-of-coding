class Solution {
    public int longestSubarray(int[] nums) {
        ArrayList<Integer> zeros = new ArrayList<>();

        for(int i =0 ; i< nums.length ; i++){
            if(nums[i]==0){
                zeros.add(i);
            }
        }

        int Consecutive_sum=0;

        if(zeros.size()==0 || zeros.size()==1){
            return nums.length-1;
        }

        for(int i =0 ; i< zeros.size() ; i++){
            int temp= 0;
            if(i==0){
                temp=(zeros.get(1)-1) ;
            } else if(i==zeros.size()-1){
                temp=(zeros.get(i)- zeros.get(i-1)-1) + (nums.length - zeros.get(i)) -1;
            }else{
                int L = (zeros.get(i) - zeros.get(i-1) )-1;
                int R = (zeros.get(i+1) - zeros.get(i))-1;
                temp= L+R;}
            
            Consecutive_sum = Math.max(Consecutive_sum, temp);
        }

        return Consecutive_sum;

    }
}