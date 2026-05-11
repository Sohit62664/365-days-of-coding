class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n= arr.length;
        for(int i =0 ; i< n ; i+=k){
            int st = i ;
            int end = i+k-1;
            if(end>=n){
                end = n-1;
            }
            reverse(st,end , arr);
        }
    }
    void reverse(int i , int j ,int [] arr){
        while(i<j){
            int temp = arr[j];
            arr[j]= arr[i];
            arr[i]= temp;
            i++;
            j--;
        }
        return;
    }
}
