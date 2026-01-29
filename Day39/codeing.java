package Day39;

import java.util.HashSet;
import java.util.Scanner;

public class codeing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X, Y, N;
        X = sc.nextInt();
        Y = sc.nextInt();
        N = sc.nextInt();

        int count = 0;
        for (int i = X; i < Y; i++) {
            if(Happyy(i) && isPrime(i)){
                count++;
            }
            
            
            
            if(count == N){
                System.out.println(i);
                break;
            }
        }

    }

    public static int digit_sum(int digit) {
        int sum = 0;
        while (digit > 0) {
            int rem = digit % 10;
            sum += Math.pow(rem, 2);
            digit /= 10;
        }
        return sum;
    }

    public static boolean Happyy(int i) {
        HashSet<Integer> set = new HashSet<>();
        while (i != 1) {
            i = digit_sum((i));
            if (set.contains(i)) {
                return false;
            }
            set.add(i);

        }
        return true;
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
