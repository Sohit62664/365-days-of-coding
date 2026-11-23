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


// Memoization 
class Solution {
    public int minCut(String s) {
        char ch[] = s.toCharArray();
        int n = s.length();
        int dp[] = new int[n];
        Arrays.fill(dp , -1);
        return f(0, ch , dp) - 1;
    }

    int f(int i, char[] ch , int [] dp) {
        if (i == ch.length)
            return 0;

        if(dp[i] != -1) return dp[i]; // minimum partion till index i , is possible is dp[i];
        int count = Integer.MAX_VALUE;
        for (int k = i; k < ch.length; k++) {

            if (palindrom(i, k, ch)) {
                // update the count when it is palindrom , earlier i was doing the mistake i was updating count even if the string is not palindrom
                int cn = 1 + f(k + 1, ch , dp);
                count = Math.min(count, cn);
            }
        }

        return dp[i] = count;
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
