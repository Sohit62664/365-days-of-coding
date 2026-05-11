import java.util.Scanner;

public class Beautiful_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int input[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int in = sc.nextInt();
                input[i][j] = in;
            }
        }

        int r = 0;
        int c = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (input[i][j] == 1) {
                    r = i;
                    c = j;
                }
            }
        }
        int rd = Math.abs(r-2);
        int cd = Math.abs(c-2);

        System.out.println(rd+cd);
    }
}
