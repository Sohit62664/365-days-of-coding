import java.util.Arrays;
import java.util.Scanner;

public class fibonachi {
    static int fib(int n , int[] arr){
        if(n<= 1) return n ;

        if(arr[n]!= -1) return arr[n];
        return arr[n] = fib(n-1 , arr) + fib(n-2 , arr);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int dp[] = new int [n+1];
        Arrays.fill(dp, -1);

        System.out.println(fib(n , dp));
        
    }
}
