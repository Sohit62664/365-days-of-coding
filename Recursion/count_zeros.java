package Recursion;

public class count_zeros {
    public static void main(String[] args) {
        System.out.println(count_zero(103003 , 0));
    }

    static int count_zero(int n , int count){
        if(n<=0) return count;
        int rem  = n%10;
        if(rem == 0){
            count= count+1;
        }
        return count_zero(n/10, count);
    }
}
