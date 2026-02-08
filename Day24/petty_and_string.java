package Day24;

import java.util.*;

public class petty_and_string {
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String a = sc.nextLine();
            String b = sc.nextLine();
            a = a.toLowerCase();
            b = b.toLowerCase();
            int i = 0;
            int n = a.length();
            boolean flag = false;
            while (i < n) {
                if (a.charAt(i) < b.charAt(i)) {
                    System.out.println(-1);
                    flag = true;
                    break;
                }
                if (a.charAt(i) > b.charAt(i)) {
                    System.out.println(1);
                    flag = true;
                    break;
                }
                i++;

            }
            if (!flag) {
                System.out.println(0);
            }

        }
    }
}
