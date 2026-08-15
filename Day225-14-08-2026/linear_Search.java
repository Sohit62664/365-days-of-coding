public class linear_Search {
    static int search(int[] arr, int i, int target){
        if(i == arr.length) return -1 ;
        if(arr[i]== target) return i ;

        return search(arr ,  i+ 1 , target);
    }

    public static void main(String[] args) {
        int arr [] = {2 , 3, 5, 6, 7, 8};

        System.out.println(search(arr, 0 , 2));
    }
}
