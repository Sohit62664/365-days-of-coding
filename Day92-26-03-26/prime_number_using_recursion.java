// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        
        prime(2 , 2 );
        
    }
    static void prime(int n, int a ){
        if(n == 1 ) {
            System.out.println("not prime");
            return;
        }
        if(a == n-1) {
            System.out.println(n+ " is an prime number");
            return;
        }
        
        if(n%a !=0){
            prime(n , a+1);
            
        }else{
            System.out.println(n+ " is not prime");
            return ;
        }
    }
}


