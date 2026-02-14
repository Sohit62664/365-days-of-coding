package Recursion;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = sc.nextInt();
        System.out.println(reverce_num(n, 0));
    }

    static int reverce_num(int n , int i){
        if(n<= 0 ) return i;
        int rem = n%10;
        int rnum= i*10+rem;
        return reverce_num(n/10, rnum);
    }
}
