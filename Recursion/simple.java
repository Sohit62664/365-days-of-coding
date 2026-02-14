package Recursion;

public class simple {
    public static void main(String[] args) {
        number(0,10);
    }
    
    // static int i = 0;
    public static void number(int i ,int n) {
        
        if(i==n){
            return;
        }
        System.out.println("The number is "+ i);
        number(i+1 , n );
        
    }
}
