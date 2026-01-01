package Day15;

import java.util.Arrays;
import java.util.HashMap;

public class Relative_Sort_Array {
    class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        Arrays.sort(arr1);

        HashMap<Integer, Integer> freq = new HashMap<>(); // counting frequency of each one 
        HashMap<Integer, Integer> covered = new HashMap<>();//covered elment of arr1 

        for (int c : arr1) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int j = 0; // Pointer for result array
        for (int i = 0; i < arr2.length; i++) {
            while (freq.get(arr2[i]) != 0) {
                result[j] = arr2[i];
                j++;
                freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) - 1);
                covered.put(arr2[i], covered.getOrDefault(arr2[i], 0) + 1);

            }
            if (freq.get(arr2[i]) == 0) {
                freq.remove(arr2[i]);
            }
        }

        // Array to store elements not present in arr2
        int[] remaining = new int[arr1.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (!covered.containsKey(arr1[i])) {
                remaining[k] = arr1[i];
                k++;
            }
        }
        int m = 0;
        while (j < arr1.length) {
            result[j] = remaining[m];
            j++;
            m++;
        }

        return result;

    }
}

// Core logic of the question is we have to arrange the element as per the arr2 elements if a element which is not present in arr2 Should be at the last of the resulting Array in Sorted manner 
}
