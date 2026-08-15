public class last_occurance_of_target {
    static int search(int[] arr, int i, int target ) {
        if (i == arr.length)
            return -1;

        

        int result = search(arr, i+1, target);

        if(result != -1){  // this condition is preventing to rech the dupllicate and helps to get last occurance 
            return result ;
        }

        if(arr[i] == target){
            return i ;
        }
        return -1 ;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 7, 8, 2, 6, 7, 6, 9, 10 };

        System.out.println(search(arr, 0, 3 ));
    }
}
