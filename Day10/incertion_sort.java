package Day10;

public class incertion_sort {
    class Solution {
        // Please change the array in-place
        public void insertionSort(int arr[]) {
            // code here
            for (int i = 1; i <= arr.length - 1; i++) {
                for (int j = i; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) {
                        swap(arr, j, j - 1);
                    } else {
                        break;
                    }
                }
            }
            return;
        }

        public static int[] swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            return arr;
        }
    }
}
