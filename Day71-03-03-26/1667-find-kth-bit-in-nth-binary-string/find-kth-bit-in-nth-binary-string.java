class Solution {

    public char findKthBit(int n, int k) {
        String sn = computeSn(n);
        return sn.charAt(k - 1);
    }

    private String computeSn(int n) {
        if (n == 1) return "0";

        String prev = computeSn(n - 1);
        StringBuilder sb = new StringBuilder();

        sb.append(prev);
        sb.append("1");

        // invert + reverse
        StringBuilder rev = new StringBuilder(prev).reverse();
        for (int i = 0; i < rev.length(); i++) {
            if (rev.charAt(i) == '0')
                rev.setCharAt(i, '1');
            else
                rev.setCharAt(i, '0');
        }

        sb.append(rev);

        return sb.toString();
    }
}