class Solution {
    public int smallestIndex(int[] nums) {
        //indexx = sum of the digit
        int i =0 ; 
        for(int x : nums){
            int sum = 0 ;
            while(x!= 0){
                sum+= (x%10);
                x/=10 ;
            }
            if(i== sum){
                return i ;
            }
            i++;
        }
        return -1;
    }
}
