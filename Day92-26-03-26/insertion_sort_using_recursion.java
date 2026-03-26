// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Insertion Sort Using Recursion");
        int arr[] = {15,2,4,2,1,3,5,7,6,8,9,454,54,54,65};
        insertion(arr, 1  );
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int [] arr , int st  ){
        if(st== arr.length ) return;
        
            int el = arr[st];
            int i = st-1 ;
            while(i>= 0 && arr[i]>el){
                arr[i+1]= arr[i];
                i--;
            }
            arr[i+1]= el;
            insertion(arr, st+1 );
        
    }
    
}
