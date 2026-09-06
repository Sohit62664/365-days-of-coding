class Solution {
    public int findMax(int n, int[] a, int[] b, int[] k) {
        // code here
        int arr[] = new int[n];
        int max = 0 ;
        
        for(int i =0 ; i< a.length ; i++){
            // range
            int l = a[i];
            int r = b[i];
            for(int j = l ; j<= r ; j++){
                arr[j] += k[i];
                max = Math.max(max , arr[j]);
            }
        }
        
        return max;
        
    }
}
