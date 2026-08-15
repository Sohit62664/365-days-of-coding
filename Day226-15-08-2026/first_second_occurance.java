import java.util.Arrays;

public class first_second_occurance {
    static int [] search(int arr[] ,int target ,int first ,int second , int i ){
        if(i == arr.length ) return new int[]{first , second} ;


        if(arr[i] == target && first== -1 ){
            first = i;
            second = i ;
            
        }
        // int [] result = search(arr, target, first, second , i+ 1) ;
        int [] result = search(arr, target, first, second , i+ 1) ;
        


        if(result[1]!= result[0]){
            return result ;
        }

        if(arr[i] == target){
            result[1] = i ;
            return result ;
        }


        return new int [] {first  , second};
        
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 7, 6, 8, 6};
        System.out.println(Arrays.toString(search(arr, 6 , -1 , -1 , 0)));
    }
}
