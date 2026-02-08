package Day22;

public class replace_Digits {
    class Solution {
        public String replaceDigits(String s) {
            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    ans.append(s.charAt(i)); // String.valueOf(primitive)
                } else {
                    ans.append(shift(s.charAt(i - 1), Integer.parseInt(String.valueOf(s.charAt(i)))));
                }
            }

            return ans.toString();
        }

        char shift(char a, int n) {
            return (char) (a + n);
        }
    }

}
