package Day26;

public class Longest_common_prefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < min) {
                    min = strs[i].length();
                }
            }
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < min; i++) {
                char ch = strs[0].charAt(i);
                boolean flag = true;
                for (int j = 0; j < strs.length; j++) {
                    if (strs[j].charAt(i) != ch) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    sb.append(ch);
                } else {
                    return sb.toString();
                }

            }

            return sb.toString();
        }
    }
}
