public class sumrec {

    static int summer(int n){
        if(n == 0) return 0 ;

        return n + summer(n-1);
    }
    public static void main(String[] args) {
        System.out.println(summer(10));
    }
}
