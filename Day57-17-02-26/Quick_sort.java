import java.util.Arrays;

public class Quick_sort {

    static void Quick_sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            Quick_sort(arr, low, pi - 1);
            Quick_sort(arr, pi + 1, high);            
        } 
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low - 1 ;
        int pi = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] < pi) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pi;
        arr[high] = arr[i];
        arr[i] = temp;

        return i;

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 3, 43, 45, 535, 64, 8 };
        Quick_sort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

}
