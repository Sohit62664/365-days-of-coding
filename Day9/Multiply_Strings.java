package Day9;

public class Multiply_Strings {
    // class Solution {
    // public String multiply(String num1, String num2) {
    // long num_1 = 0 ;
    // for(int i =0 ; i< num1.length() ; i++){
    // char ch = num1.charAt(i);
    // int digit = ch - '0';
    // num_1 = num_1* 10 +digit;
    // }

    // long num_2 = 0 ;
    // for(int i =0 ; i< num2.length() ; i++){
    // char ch = num2.charAt(i);
    // int digit = ch - '0';
    // num_2 = num_2* 10 +digit;
    // }

    // String ans = num_1 * num_2 + "";

    // return ans;
    // }
    // }

    class Solution {
        public String multiply(String num1, String num2) {
            // Edge case
            if (num1.equals("0") || num2.equals("0"))
                return "0";

            int m = num1.length();
            int n = num2.length();
            int[] result = new int[m + n];

            // Multiply each digit
            for (int i = m - 1; i >= 0; i--) {
                int d1 = num1.charAt(i) - '0';
                for (int j = n - 1; j >= 0; j--) {
                    int d2 = num2.charAt(j) - '0';

                    int mul = d1 * d2;
                    int sum = mul + result[i + j + 1];

                    result[i + j + 1] = sum % 10; // digit
                    result[i + j] += sum / 10; // carry
                }
            }

            // Convert result array to string
            StringBuilder sb = new StringBuilder();
            for (int num : result) {
                if (!(sb.length() == 0 && num == 0)) {
                    sb.append(num);
                }
            }

            return sb.toString();
        }
    }

}
