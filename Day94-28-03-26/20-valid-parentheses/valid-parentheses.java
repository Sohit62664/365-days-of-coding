class Solution {
    int i = 0;

    public boolean isValid(String s) {
        i = 0;
        return helper(s, '#') && i == s.length();
    }

    boolean helper(String s, char expected) {
        while (i < s.length()) {
            char ch = s.charAt(i++);

            if (ch == '(') {
                if (!helper(s, ')')) return false;
            } 
            else if (ch == '{') {
                if (!helper(s, '}')) return false;
            } 
            else if (ch == '[') {
                if (!helper(s, ']')) return false;
            } 
            else {
                
                return ch == expected;
            }
        }
        return expected == '#';
    }
}