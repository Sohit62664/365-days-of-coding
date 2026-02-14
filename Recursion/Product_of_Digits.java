package Recursion;

import java.util.Scanner;

public class Product_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = sc.nextInt();
        System.out.println(product(n, 1));
    }

    static int product(int n , int i){
        if(n<= 0 ) return i;
        int rem = n%10;

        return product(n/10, i*rem);
    }
}
