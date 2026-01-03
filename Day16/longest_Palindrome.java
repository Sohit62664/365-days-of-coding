import java.util.HashMap;

public class longest_Palindrome {
    class Solution {
        public int longestPalindrome(String s) {
            /*
             * logic : findout the frequency of every character
             * if(freq==1)flag = true ;
             * if(freq%2==0)= sum+=freq;
             * if(odd) sum+=freq-1;
             * in last if(flag) sum+1; else sum;
             */
            HashMap<Character, Integer> map = new HashMap<>();

            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            int sum = 0;
            boolean flag = false;
            for (Integer freq : map.values()) {

                if (freq % 2 != 0) {
                    sum += (freq - 1);
                    flag = true;
                } else {
                    sum += freq;
                }
            }
            if (!flag) {
                return sum;
            } else {
                return sum + 1;
            }

        }
    }
}
