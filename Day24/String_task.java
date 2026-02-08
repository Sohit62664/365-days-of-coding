package Day24;

import java.util.*;

public class String_task {

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                // skip vowels
                if (!isVowel(c)) {
                    // convert to lowercase if uppercase
                    if (c >= 'A' && c <= 'Z') {
                        c = Character.toLowerCase(c);
                    }
                    // add dot before consonant
                    builder.append('.').append(c);
                }
            }

            System.out.println(builder.toString());
        }

        public static boolean isVowel(char c) {
            return c == 'A' || c == 'O' || c == 'Y' || c == 'E' || c == 'U' || c == 'I' ||
                    c == 'a' || c == 'o' || c == 'y' || c == 'e' || c == 'u' || c == 'i';
        }
    }
}
