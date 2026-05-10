class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        // m1  sort and get 
        int max = Integer.MIN_VALUE;
        int second = -1;
        
        for(int i=0 ; i< arr.length ; i++){
            if(max<arr[i]){
                int temp = max;
                max= arr[i];
                if(temp != max)
                second = temp;
            }
            
            if(arr[i]!= second && arr[i]>second && arr[i]<max){
                second = arr[i];
            }
        }
        if(second== Integer.MIN_VALUE){
            return -1;
        }else{
            return second;
        }
    }
}
