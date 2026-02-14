package Recursion;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = sc.nextInt();
        if(reverce_num(n, 0)==n) 
        System.out.println("Palindrom");
        else System.out.println("not Palindrom");
    }

    static int reverce_num(int n , int i){
        if(n<= 0 ) return i;
        int rem = n%10;
        int rnum= i*10+rem;
        return reverce_num(n/10, rnum);
    }
}
