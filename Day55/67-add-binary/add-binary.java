class Solution {
    public String addBinary(String x, String y) {
        int i = x.length() - 1;
        int j = y.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) sum += x.charAt(i--) - '0';
            if (j >= 0) sum += y.charAt(j--) - '0';

            result.append(sum % 2);
            carry = sum / 2;
        }

        if (carry == 1) {
            result.append(1);
        }

        return result.reverse().toString();
    }
}