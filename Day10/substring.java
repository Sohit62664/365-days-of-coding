package Day10;

public class substring {

    public static int countSubRec(String s, int i) {

        // Base Case: when index exceeds string length
        if (i == s.length()) {
            return 0;
        }

        int count = 0;
        String e = "" + s.charAt(i);
        System.out.println(e);

        // Always count single character
        count++;
        System.out.println();
        // Count substrings starting at i and ending at j
        for (int j = i + 1; j < s.length(); j++) {

            e += s.charAt(j);
            if (s.charAt(i) == s.charAt(j)) {
                System.out.println(e);
                count++;
            }
        }

        // Recursive call for next index
        return count + countSubRec(s, i + 1);
    }

    public static void main(String[] args) {
        String s = "abcab";
        System.out.println(countSubRec(s, 0)); // Output: 4
    }
}
