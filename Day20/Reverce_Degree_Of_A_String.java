package Day20;

public class Reverce_Degree_Of_A_String {
    class Solution {
        public int reverseDegree(String s) {
            // 'a'-> = 123-97 = 26
            // 123- ascii value =

            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                int temp = (123 - ch);
                sum += temp * (i + 1);
            }

            return sum;
        }
    }
}
