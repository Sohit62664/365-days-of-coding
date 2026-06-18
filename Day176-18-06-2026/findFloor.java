class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        // first Aproach 
        if(x==0){
            return -1 ;
        }
        if(arr.length == 1){
            if(arr[0]<x){
                return 0;
            }else{
                return -1;
            }
        }
        
        int i =0 ;
        while(i<arr.length && arr[i]<=x){
            i++;
        }
        
        i--;
        return i;
    }
}
