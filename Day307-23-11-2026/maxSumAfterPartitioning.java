class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length; 

        return f(0 , arr , k);
    }
    int f(int i , int [] arr , int k){
        if(i >= arr.length){
            return 0 ;
        }
        int max = arr[i];
        int sum = 0;
        for(int j = i ; (j < i + k) && (j < arr.length) ; j++){
            max = Math.max(max , arr[j]);
            int len = j-i+1;
            int cost = (len * max) + f(j+1 , arr , k);
            sum = Math.max(cost , sum);
        }
        return sum ;
    }
}
