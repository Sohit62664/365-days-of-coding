class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min = arr[0] , max = arr[0];
        
        int result [] = minmax(arr , min , max , 0 );
        
        return new ArrayList<>(Arrays.asList(result[0] , result[1]));
        
    }
    
    int [] minmax(int arr[] ,int min ,int max ,int i ){
        if(i == arr.length) return new int[]{min, max} ;
        
        min = Math.min(min , arr[i]);
        max = Math.max(max , arr[i]);
        
        return minmax(arr, min , max , i+1 );
        // return new int[]{min, max} ;
    }
}
