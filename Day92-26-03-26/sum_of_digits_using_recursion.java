// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.print("sum of Digits is ");
        int n= 123456;
        System.out.println(sum(n , 0));
    }
    static int sum(int n , int s ){
        if(n == 0) return s ;
        
        int rem = n % 10 ;
        
        return sum(n/10 , s+rem);
        
    }
}

