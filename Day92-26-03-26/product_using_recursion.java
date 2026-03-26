// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.print("inverce number is ");
        int x = 5;
        int y = 12;
        if(x>y) {
        System.out.println(product(x , y, 0));
        }else{
            System.out.println(product(y, x , 0));
        }
    }
    static int product(int x , int y, int p ){
        if(y == 0 ) return  p;
        
        return product(x , y-1 , p)+x;
    }
}


