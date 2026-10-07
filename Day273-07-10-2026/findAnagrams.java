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
