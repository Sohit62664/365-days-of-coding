// public class max {
//     static int m = Integer.MIN_VALUE;

//     static int max(int[] arr, int i) {
//         // base case
//         if (i == arr.length)
//             return m;

//         m = Math.max(m , arr[i]);
//         // recursive case
//         return max(arr, i + 1);
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 7, 2, 9, 5};
//         System.out.println(max(arr , 0));
//     }
// }


// without using extra variable 


public class max {
    

    static int max_v(int[] arr, int i) {
        // base case
        if (i == arr.length-1)
            return arr[i];

        // recursive case
        return Math.max(arr[i] , max_v(arr , i+1));
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        System.out.println(max_v(arr , 0));
    }
}