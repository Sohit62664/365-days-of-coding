public class oneton {
    static void printerone(int n){
        if(n== 0){
            return ;
        }

        printerone(n-1);
        System.out.println(n);
    }


    static void printer(int n){
        if(n == 0) return ;
        System.out.println(n);
        printer(n-1);
    }
    public static void main(String[] args) {
        printer(5);
    }
}



