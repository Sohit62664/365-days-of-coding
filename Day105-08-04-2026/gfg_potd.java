class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int count=0;
        for(int i =0 ; i< arr.length; i++){
            if(arr[i]== 0){
                count++;
            }
        }
        
        Arrays.fill(arr, 1);
        for(int i =0 ; i< count ; i++){
            arr[i]= 0;
        }
        return ;
    }
}
