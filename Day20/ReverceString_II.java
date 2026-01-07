package Day20;

public class ReverceString_II {
    class Solution {
        public String reverseStr(String s, int k) {

            StringBuilder sb = new StringBuilder(s);

            for (int i = 0; i < sb.length(); i += 2 * k) {

                int left = i;
                int right = Math.min(i + k - 1, sb.length() - 1);

                while (left < right) {
                    char temp = sb.charAt(left);
                    sb.setCharAt(left, sb.charAt(right));
                    sb.setCharAt(right, temp);
                    left++;
                    right--;
                }
            }

            return sb.toString();
        }
    }

    class Solution2 {
        public String reverseStr(String s, int k) {
            StringBuilder sb = new StringBuilder(s);

            for (int i = 0; i < sb.length(); i += 2 * k) {
                int left = i;
                int right = Math.min(i + k - 1, sb.length() - 1);
                // Now Perform four actions 1. Findout the part 2. Findout the reverce of it ,
                // 3. delete the part 4. insert the reverce part
                String part = sb.substring(left, right + 1); // We Are not Directly Using StringBuilder Becauce
                                                             // substring function returns only String

                StringBuilder rev = new StringBuilder(part);

                rev.reverse();

                sb.delete(left, right + 1); // Right +1 becauce the function delete(st , end) in this end is exclusive

                sb.insert(left, rev);
            }

            return sb.toString();

        }
    }

}
