class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        // int i =0 ;
        // int j = arr.length-1 ;
        // while (i<j){
        //     if(arr[j]== 0){
        //         j--;
        //         continue;
        //     }
            
        //     if(arr[i]==0){
        //         arr[i]= arr[j];
        //         arr[j]=0;
        //         j--;
                
        //     }
        //     i++;
        // }
        // return ;
        int j = 0;
        for(int i =0 ; i< arr.length ; i++){
            if(arr[i]==0){
                continue;
            }else{
                
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i]= temp;
                j++;
            }
        }
    }
}
