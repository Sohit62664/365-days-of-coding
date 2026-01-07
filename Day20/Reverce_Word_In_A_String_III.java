package Day20;

public class Reverce_Word_In_A_String_III {
    // The Solution is for Diffrent problem ->
    // class Solution {
    // public String reverseWords(String st) {
    // String s = String.join(" ", st.trim().split("\\s+"));
    // /*
    // logic :
    // remove extra space
    // split the Words
    // revrece the words and store them
    // */

    // String[] sp = s.split(" ");
    // StringBuilder answer = new StringBuilder();

    // for (int i = s.length() - 1; i >= 0; i--) {
    // StringBuilder p = new StringBuilder(sp[i]);
    // answer.append(p.reverse());
    // if (i != 0)
    // answer.append(" ");
    // }
    // return answer.toString();
    // }
    // }

    class Solution {
        public String reverseWords(String st) {

            String s = String.join(" ", st.trim().split("\\s+"));
            String[] sp = s.split(" ");

            StringBuilder answer = new StringBuilder();
            for (int i = 0; i < sp.length; i++) {
                StringBuilder p = new StringBuilder(sp[i]);
                p.reverse();
                answer.append(p);
                if (i != sp.length - 1)
                    answer.append(" ");
            }

            return answer.toString();
        }
    }
}
