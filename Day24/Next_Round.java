package Day24;

import java.util.*;
public class Next_Round {


public class Solution {
    public static void main(String[] args) {
        int n, k;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int cutOff = a[k - 1];

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= cutOff && a[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}}
