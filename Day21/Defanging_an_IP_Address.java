public class Defanging_an_IP_Address {
    class Solution1 {
        public String defangIPaddr(String s) {
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '.') {
                    builder.append("[.]");
                } else {
                    builder.append(s.charAt(i));
                }

            }

            return builder.toString();
        }
    }

    class Solution2 {
        public String defangIPaddr(String s) {
            return s.replace(".", "[.]");
        }
    }

}
