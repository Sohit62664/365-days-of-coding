public class print1223321 {
    static void printer(int n) {
        if (n == 0)
            return;

        System.out.println(4-n);
        printer(n-1);
        System.out.println(4-n);
    }

    public static void main(String[] args) {
        printer(3);
    }
}
