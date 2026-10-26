import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Divisible_permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            func(n);
        }
    }

    static void func(int n) {

        int arr[] = new int[n];

        int a = n;
        int b = 1;

        for (int i = n - 1; i > 0; i--) {
            arr[i] = a--;
            arr[i - 1] = b++;
            i--;
        }

        if (n % 2 != 0) {
            arr[0] = a;
        }

        for(int i =0 ; i< n ; i++){
            System.out.print(arr[i] + " ");
        }
        // System.out.println(Arrays.toString(arr));
    }

}
