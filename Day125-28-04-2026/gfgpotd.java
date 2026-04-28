class Solution {

    public int longestSubstr(String s, int k) {

        int[] arr = longestconsecutive(s);

        int st = arr[0];
        int elc = st + arr[1] - 1;
        int llc = arr[1];

        char lc = s.charAt(st);
        int n = s.length();

        int rightcount = 0;
        int leftcount = 0;

        // RIGHT
        int r = k;
        int i = 1;
        int j = 0;

        while (r != 0 && (elc + i) < n && j <= k) {
            if (s.charAt(elc + i) == lc) {
                i++;
            } else {
                j++;
                r--;
                i++;
            }
        }

        rightcount = llc + i - 1;

        if ((k - j) != 0) {
            while ((k - j) != 0 && (st - j) >= 0) {
                rightcount++;
                j++;
            }
        }

        // LEFT
        int l = k;
        i = 1;
        j = 0;

        while (l != 0 && (st - i) >= 0 && j <= k) {
            if (s.charAt(st - i) == lc) {
                i++;
            } else {
                j++;
                l--;
                i++;
            }
        }

        leftcount = llc + i - 1;

        if ((k - j) != 0) {
            while ((k - j) != 0 && (elc + j) < n) {
                leftcount++;
                j++;
            }
        }

        return Math.max(leftcount, rightcount);
    }

    public int[] longestconsecutive(String s) {
        if (s == null || s.length() == 0) return new int[]{-1, 0};

        int i = 1;
        int start = 0;

        int maxStart = 0;
        int maxLength = 1;

        int count = 1;

        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                if (count > maxLength) {
                    maxLength = count;
                    maxStart = start;
                }
                start = i;
                count = 1;
            }
            i++;
        }

        if (count > maxLength) {
            maxLength = count;
            maxStart = start;
        }

        return new int[]{maxStart, maxLength};
    }
}



// class Solution {
//     public int longestSubstr(String s, int k) {
        
//          int[] freq=new int[26];
//         int j=0;
//         int maxfreq=0;
//         int maxlen=0;
//         int n= s.length();
//         for(int i=0;i<n;i++)
//         {
//             freq[s.charAt(i)-'A']++;
            
//             maxfreq=Math.max(maxfreq,freq[s.charAt(i)-'A']);
            
//             while((i-j+1)-maxfreq>k)
//             {
//                 freq[s.charAt(j)-'A']--;
//                 j++;
//             }
//             maxlen=Math.max(maxlen,i-j+1);
//         }
//         return maxlen;
//     }
// }
