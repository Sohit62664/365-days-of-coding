class Solution {
    public int coin(int[] arr) {
        // code here
        int min = arr[0];
        int n= arr.length;
        for(int i= 0 ; i< n ; i++){
            min = Math.min(min , arr[i]);
        }
        return min;
    }
}
