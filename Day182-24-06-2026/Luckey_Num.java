import java.util.Scanner;

public class Luckey_Num {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for (int i = 4; i <= n; i++) {
            if (check(i)) {
                if (n % i == 0) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");

    }

    static boolean check(int n) {
        while (n > 0) {
            int rem = n % 10;

            n/= 10 ; 
            if (rem == 4 || rem == 7) {
                continue;
            } else {
                return false;
            }
            
        }
        return true;
    }
}
