

public class min {
    

    static int min_v(int[] arr, int i) {
        // base case
        if (i == arr.length-1)
            return arr[i];

        // recursive case
        return Math.min(arr[i] , min_v(arr , i+1));
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        System.out.println(min_v(arr , 0));
    }
}