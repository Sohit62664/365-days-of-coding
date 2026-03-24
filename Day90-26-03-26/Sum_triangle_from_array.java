// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int [] arr = {1,2,3,4,5};
        sum(arr , 5);
    }
    
    public static void sum(int [] arr , int len){
        if(len == 1 ){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int [] ans = new int[len-1];
        for(int i=0 ; i< len - 1 ; i++){
            ans[i]= arr[i]+arr[i+1];
        }
        
        sum(ans , len-1);
        System.out.println(Arrays.toString(arr));
    }
}
