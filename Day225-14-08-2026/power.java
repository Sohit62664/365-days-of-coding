public class power {
    static int pow(int n , int m){
        if(m == 0) return 1 ;

        return n * pow(n , m-1);
    }

    public static void main(String[] args) {
        System.out.println(pow(2,5));
    }
}
