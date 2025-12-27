package Day9;

public class bubble_sort {
    class Solution {
        public void bubbleSort(int[] arr) {
            // code here
            // run till the n-1 steps
            int n = arr.length;
            boolean swaped;

            for (int i = 0; i < n; i++) {
                //
                swaped = false;
                // for each step max element come at the last 
                for (int j = 1; j < n - i; j++) {

                    // check for swaped
                    if (arr[j] < arr[j - 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                        swaped = true;
                    }
                }

                if (!swaped) {
                    break;
                }
            }
            return;
        }
    }
}
