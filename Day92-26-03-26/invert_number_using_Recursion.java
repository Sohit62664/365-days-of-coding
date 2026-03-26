// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.print("inverce number is ");
        int n= 123456;
        System.out.println(sum(n , 0));
    }
    static int sum(int n , int s ){
        if(n == 0) return s ;
        
        int rem = n % 10 ;
        s = s*10+rem;
        return sum(n/10 , s);
        
    }
}


