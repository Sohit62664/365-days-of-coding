package Recursion;

import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = sc.nextInt();
        System.out.println(sum(n, 0));
    }

    static int sum(int n , int i){
        if(n<= 0 ) return i;
        int rem = n%10;

        return sum(n/10, i+rem);
    }
}
