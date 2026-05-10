class Solution {
    public int minFlips(String s) {
        //logic 
        //thire is only 4 ways to be a cohrent 
        // all zeros 
        // all ones 
        // exactly one ones 
        // two ones at the positionn 0 , n-1 


        int ones = 0;
        int zeros = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '1')
                ones++;
            if (ch == '0')
                zeros++;
        }

        if (ones == 0 || zeros == 0) {
            return 0;
        }
        int ans1 = Integer.MAX_VALUE;

        if (ones == 1) {
            return 0;
        }


        if (s.charAt(0) == '1' && s.charAt(s.length() - 1) == '1') {
            ans1 = Math.min(ones - 2, zeros);
        }

        int ans2 = Integer.MAX_VALUE;
        if (ones > 1) {
            ans2 = Math.min(ones - 1, zeros);
            
        }
        return Math.min(ans1, ans2);
    }

}
