package Recursion.Patterns;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] num = { 1, -5, 3, 6, 9, 3, 67, 56, 45 };
        num = merge_sort(num);
        System.out.println(Arrays.toString(num));
    }

    static int[] merge(int[] first, int[] second) {
        int[] ans = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] > second[j]) {
                ans[k] = second[j];
                j++;
                k++;
            } else {
                ans[k] = first[i];
                i++;
                k++;
            }

        }

        while (i < first.length) {
            ans[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            ans[k] = second[j];
            j++;
            k++;
        }
        return ans;
    }

    static int[] merge_sort(int[] num) {

        if (num.length == 1)
            return num;

        int mid = num.length / 2;
        int[] left = merge_sort(Arrays.copyOfRange(num, 0, mid));
        int[] right = merge_sort(Arrays.copyOfRange(num, mid, num.length));

        return merge(right, left);

    }
}
