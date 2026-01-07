package Day20;

public class Reverce_Word_In_A_String {
    class Solution {
        public String reverseWords(String st) {

            /*
             * Remove the extra Space With the help Of this Function
             * String result = String.join(" ", s.trim().split("\\s+"));
             * 
             * How this Works
             * 
             * trim() → removes leading & trailing spaces
             * 
             * \\s+ → matches one or more spaces
             * 
             * split("\\s+") → breaks string into words
             * 
             * String.join(" ", ...) → joins words with single space
             * 
             * 
             * 
             * 
             * 
             * reverce the words
             * approach-> spilit the string into array
             * -> reverce it
             * -> convert it into String
             */
            String s = String.join(" ", st.trim().split("\\s+"));
            String[] sp = s.split(" ");
            StringBuilder answer = new StringBuilder();
            for (int i = sp.length - 1; i >= 0; i--) {
                answer.append(sp[i]);
                if (i != 0)
                    answer.append(" ");
            }

            return answer.toString();
        }
    }
}
