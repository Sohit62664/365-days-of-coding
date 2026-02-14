package Recursion;

public class sum_of_n_number {
    public static void main(String[] args) {
        System.out.println(sum(100, 0));
    }

    static int sum(int n, int i){
        if (n==0) return i;
        return sum(n-1, i+n);
    }

}
