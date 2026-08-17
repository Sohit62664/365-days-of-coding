public class Subsequance {

    static void subsequences(String s, int i, String ans) {
        // When to Print
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }

        // don't take
        subsequences(s, i + 1, ans);
        // take
        subsequences(s, i + 1, ans + s.charAt(i));

        //call function

        subsequences("abc" , 0 , "); 
    } 
}
