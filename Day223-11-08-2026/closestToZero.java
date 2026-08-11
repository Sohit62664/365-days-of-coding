class Solution {
    public static int closestToZero(int arr[]) {
        // code here
        // closets mense minimize the sum as much as you can 
        int ans = Integer.MAX_VALUE;
        
        
        
        // by Sorting 
        Arrays.sort(arr);
        
        int i =0 ; 
        int j = arr.length - 1;
        
        while(i< j){
            int curr_sum = arr[i]+ arr[j];
            
            if(Math.abs(ans) > Math.abs(curr_sum)){
                ans = curr_sum;
            }else if( Math.abs(curr_sum) == Math.abs(ans) ){
                ans = Math.max(curr_sum , ans);
            }
            
            
            //Updation of i , j 
            if(curr_sum  <  0){
                i++;
            }else if(curr_sum > 0 ) {
                j--;
            }else{
                return 0 ;
            }
        }
        
        return ans ; 
    }
}
