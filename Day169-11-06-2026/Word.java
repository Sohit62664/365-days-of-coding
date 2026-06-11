// https://codeforces.com/problemset/problem/59/A


// 'A'- 65
// 'Z'- 90

// a=97
// a= 122



import java.util.*;

public class Word {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder w = new StringBuilder(s);

        int u = 0;
        int l = 0;

        for (int i = 0; i < w.length(); i++) {
            char ch = w.charAt(i);

            if (ch >= 65 && ch <= 90) {
                u++;
            } else {
                l++;
            }
        }

        if (u > l) {
            // uppercase
            for (int i = 0; i < w.length(); i++) {
                char ch = w.charAt(i);

                if (ch >= 65 && ch <= 90) {
                    continue;
                } else {
                    w.setCharAt(i, (char) (ch - 32));
                }
            }

        } else {
            // lowercase
            for (int i = 0; i < w.length(); i++) {
                char ch = w.charAt(i);

                if (ch >= 65 && ch <= 90) {
                    w.setCharAt(i, (char) (ch + 32));
                }
            }
        }

        System.out.println(w);

    }
}
