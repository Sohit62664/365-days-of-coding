class Solution {
    public int myAtoi(String s) {

        boolean negative = false;
        long num = 0;
        int i = 0;

        // Skip whitespaces 
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() &&
                (s.charAt(i) == '-' || s.charAt(i) == '+')) {

            negative = s.charAt(i) == '-';
            i++;
        }

        // Read digits
        while (i < s.length() &&
                s.charAt(i) >= '0' && s.charAt(i) <= '9') {

            char ch = s.charAt(i);
            num = num * 10 + (ch - '0');
            i++;
            if (num > Integer.MAX_VALUE) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }

        // Overflow

        return negative ? (int) -num : (int) num;
    }
}
