public class to_lower_case {
    class Solution {
        public String toLowerCase(String s) {
            StringBuilder builder = new StringBuilder(s);

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    char ch = (char) (s.charAt(i) + 32);
                    // builder.deleteCharAt(i);
                    // builder.insert(i, ch);
                    builder.setCharAt(i, ch);
                }
            }

            return builder.toString();

        }
    }
}
