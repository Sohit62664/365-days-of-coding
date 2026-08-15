public class print3211223 {
    static void printer(int n){
        if(n == 0 ) return ;

        System.out.println(n);
        printer(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printer(5);
    }
}
