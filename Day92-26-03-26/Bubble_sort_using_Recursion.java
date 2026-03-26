// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Bubble Sort Using Recursion");
        int arr[] = {15,2,4,2,1,3,5,7,6,8,9,454,54,54,65};
        bub_sort(arr, 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void bub_sort(int [] arr , int st , int end ){
        if (end == 0) return;
        if(st<end){
            if(arr[st]>arr[st+1]){
                int temp = arr[st];
                arr[st]= arr[st+1];
                arr[st+1] = temp ;
            }
            bub_sort(arr, st+1 , end);//inner call
        }else{
            bub_sort(arr,0 , end-1);//outer new  end  to 0 
        }
    }
    
}


// GFG Question passes 1010  test cases

class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        bub_sort(arr, 0 , arr.length-1);
        return;
    }
    
    void bub_sort(int [] arr , int st , int end){
        if(end== 0 ) return ;
        if(st<end){
            if(arr[st]>arr[st+1]){
                int temp = arr[st];
                arr[st]= arr[st+1];
                arr[st+1]= temp;
            }
            bub_sort(arr, st+1 , end);
        }else{
            bub_sort(arr , 0 , end-1);
        }
    }
}
