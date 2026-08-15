import java.util.Arrays;

public class reverse_array {
    static void reverse(int [] arr , int i){
        if(i == arr.length/2 ) return ;

        int j = arr.length -i  -1;
        int temp = arr[i] ;
        arr[i] = arr[j];
        arr[j] = temp ;
        reverse( arr , i+1);

        

    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 7, 6, 8, 6 , 1};
        reverse(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
