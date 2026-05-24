class Solution {
    public String replaceSubstr(String s, String part, String s2) {

        StringBuilder ans = new StringBuilder();

        int n = s.length();
        int m = part.length();

        for (int i = 0; i < n; i++) {

            if (i + m <= n && s.substring(i, i + m).equals(part)) {

                ans.append(s2);

                i += m - 1; 
                // -1 because for loop will do i++

            } else {

                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}
