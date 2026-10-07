class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // thake the SUbstring and Sort it 
        // if(equal) then put it into answer 
        // Implimetation of brute force 

        List<Integer> ls = new ArrayList<>();

        char ch[] = p.toCharArray();
        Arrays.sort(ch);
        String orignal = new String(ch);
        int left =0 ;
        for(int right = p.length() ; right <= s.length() ; right++){
            
                String str = s.substring(left , right);
                char sr [] =  str.toCharArray();
                Arrays.sort(sr);

                String sub = new String(sr);

                if(sub.equals(orignal)){
                    ls.add(left);
                }
                left++;
        }

        
       
        
        return ls;
    }
}


// Approach 02

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] orignal_freq = new int[26];
        int[] window = new int[26];

        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            int index = ch - 'a';
            //  System.out.println(index);
            orignal_freq[index]++;
        }

        // System.out.println(orignal_freq[0]);/

        List<Integer> ls = new ArrayList<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            
            // first Addig into the window 
            window[s.charAt(right)-'a']++;

            // second maintain window 
            if(right- left+1 > p.length()){
                window[s.charAt(left)-'a']--;
                left++;
            }

            // third if we have the window size

            if (right - left +1  == p.length()) {

                boolean equal = true;
                for (int i = 0; i < 26; i++) {
                    if (orignal_freq[i] != window[i]) {
                        equal = false;
                        break;
                    }
                }
                
                if (equal) {

                    ls.add(left);
                }
                char ch = s.charAt(left);
                int index = ch - 'a';
                if (window[index] > 0) {
                    window[index]--;
                }
                left++;

            }
        }

        return ls;
    }
}
