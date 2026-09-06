import java.util.Arrays;
import java.util.Scanner;

public class fibonachi {
    static int fib(int n , int[] arr){
        if(n<= 1) return n ;

        if(arr[n]!= -1) return arr[n];
        return arr[n] = fib(n-1 , arr) + fib(n-2 , arr);
    }


    static int fib_tab(int n){
        int prev= 1 ;
        int prev2 = 0 ;

        for(int i=2 ; i < n+1 ; i++ ){
            int curr = prev+prev2;
            prev2 = prev ;
            prev= curr;
        }

        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int dp[] = new int [n+1];
        Arrays.fill(dp, -1);

        System.out.println(fib(n , dp));
        System.out.println(fib_tab(n));
    }
}
