public class reverce_vowel {
    class Solution {
        public String reverseVowels(String s) {
            StringBuilder builder = new StringBuilder(s);
            StringBuilder vowels = new StringBuilder();
            // HashMap<
            for (int i = 0; i < s.length(); i++) {
                if (is_vowel(s.charAt(i))) {
                    vowels.append(s.charAt(i));
                }
            }

            vowels.reverse();
            int j = 0;
            for (int i = 0; i < s.length(); i++) {
                if (is_vowel(s.charAt(i))) {
                    builder.setCharAt(i, vowels.charAt(j));
                    j++;
                }
            }

            return builder.toString();
        }

        boolean is_vowel(char a) {
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O'
                    || a == 'U') {
                return true;
            }
            return false;
        }
    }
}
