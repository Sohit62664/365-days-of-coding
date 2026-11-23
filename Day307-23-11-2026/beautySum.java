class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int[] hash = new int[26];
          
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                hash[ch - 'a']++;

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (int k = 0; k < 26; k++) {
                    max = Math.max(max, hash[i]);
                    if (hash[i] != 0) {
                        min = Math.min(min, hash[i]);
                    }
                }
                
                // System.out.println(max);
                // System.out.println(min);
                System.out.println(max - min);

                sum += max - min;
            }
            System.out.println(Arrays.toString(hash));
        }
        return sum;
    }
}


// correct Code 
class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int[] hash = new int[26];
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                hash[ch - 'a']++;

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (int k = 0; k < 26; k++) {
                    max = Math.max(max, hash[k]);
                    if (hash[k] != 0) {
                        min = Math.min(min, hash[k]);
                    }
                }
                // System.out.println(max - min);
                

                sum += max - min;
            }
            // System.out.println(Arrays.toString(hash));
        }
        return sum;
    }
}
