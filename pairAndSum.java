class Solution {
    public long pairAndSum(int[] arr) {
        // code here
        //Brute Force approach 
        int sum = 0;
        for(int i =0 ; i< arr.length ; i++){
            
            for(int j = i+1 ; j< arr.length ; j++){
                if(i<j){
                    sum+= arr[i] &arr[j];
                }
            }
        }
        return sum ;
    }
}
