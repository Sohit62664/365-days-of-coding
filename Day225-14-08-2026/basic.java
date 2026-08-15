public class basic {
    public static void main(String[] args) {
        fun(10);
    }

    static void fun(int n){
        System.out.println(n);
        if(n == 0 ){
            System.out.println("Back -> "+ n);
            return ;
        }
        fun(n-1);
        System.out.println("Back -> " + n);
    }
}