package Recursion;
public class one_to_n {
    public static void main(String[] args) {
        printer(5,1);
    }

    static void printer(int n, int i) {
        if (i>n)
            return;
        // i++;
        System.out.println(i); // print then call function , For reverce first call then Print 
        printer(n, i+1);
    }
}