class Solution {
    public int minCut(String s) {
        char ch[] = s.toCharArray();

        return f(0, ch) - 1;
    }

    int f(int i, char[] ch) {
        if (i == ch.length)
            return 0;
        int count = Integer.MAX_VALUE;
        for (int k = i; k < ch.length; k++) {

            if (palindrom(i, k, ch)) {
                // System.out.println("Hii");
                int cn = 1 + f(k + 1, ch);
                count = Math.min(count, cn);
            }
            // System.out.println(cn);
        }

        return count;
    }

    boolean palindrom(int i, int j, char ch[]) {

        while (i <= j) {
            if (ch[i] != ch[j]) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
