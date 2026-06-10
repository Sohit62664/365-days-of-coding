import java.util.*;

public class Stones_on_the_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            char pre = s.charAt(i - 1);
            char curr = s.charAt(i);

            if (pre == curr) {
                count++;
            }
        }
        System.out.println(count);
    }
}
