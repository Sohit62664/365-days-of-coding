//https://codeforces.com/problemset/problem/66/B


import java.util.*;

public class water {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            h[i] = t;
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i;

            // while(left-1 >= 0 && h[i]>=h[left-1] ){
            // left--;
            // }

            // while(right +1 < n && h[i] >= h[right+1]){
            // right++;
            // }

            while (left - 1 >= 0 && h[left] >= h[left - 1]) {
                left--;
            }

            while (right + 1 < n && h[right] >= h[right + 1]) {
                right++;
            }
            ans = Math.max(ans, right - left + 1);
        }

        System.out.println(ans);
    }
}
