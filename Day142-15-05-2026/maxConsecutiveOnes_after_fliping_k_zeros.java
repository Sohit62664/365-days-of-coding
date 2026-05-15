class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        // k= 0; need max contigious sum 
        
        
        int max = 0 ;
        int count = 0;
        for( int st= 0 , end= 0 ; end<arr.length ; end++){
            if(arr[end] == 0){
                count++;
            }
            while(count>k){
                if(arr[st]== 0){
                    count--;
                }
                st++;
            }
            
            max = Math.max(end-st+1 , max);
        }
        
        return max ;
    }
}
