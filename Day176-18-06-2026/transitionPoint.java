class Solution {
    int transitionPoint(int arr[]) {
        // code here
        
        if(arr[0]== 1){
            return 0;
        }
        int n= arr.length;
        for(int i=0 ; i< n  ; i++){
            if(arr[i] == 1){
                return i;
            }
        }
        
        return -1;
    }
}
