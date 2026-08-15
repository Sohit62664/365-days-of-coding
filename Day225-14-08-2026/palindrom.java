/**
 * palindrom
 */
public class palindrom {
    static boolean isPalindrome(String s, int left, int right) {

        if (left >= right ) {
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        return isPalindrome(s , left+1 , right-1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam", 0, 4));
    }

}