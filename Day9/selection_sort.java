package Day9;

public class selection_sort {
    class Solution {
        void selectionSort(int[] arr) {
            // code here
            for (int i = 0; i < arr.length; i++) {
                // find max in the remaining array

                int last = arr.length - i - 1;
                int maxindex = getindex(arr, 0, last);

                swap(arr, maxindex, last);
            }
        }

        static int getindex(int[] arr, int start, int end) {
            int max = start;
            for (int i = start; i <= end; i++) {
                if (arr[max] < arr[i]) {
                    max = i;
                }
            }
            return max;
        }

        static int[] swap(int[] arr, int second, int first) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;

            return arr;
        }
    }
}
