package Day10;


import java.lang.reflect.Array;
import java.util.Arrays;

public class cycle_sort {
    //works only for contigious array 
    public static void main(String[] args) {
        
        int [] arr= {2,4,1,3,5};
        cycle_sortt(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] cycle_sortt(int [] arr){
        for(int i= 0 ; i < arr.length ; i++){
            while(arr[i]-1!= i){
                swap(arr , i , arr[i]-1);
            }
        }
        return arr;
    }

    public static int [] swap(int[]arr , int i , int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
        
        return arr;
    }
}
