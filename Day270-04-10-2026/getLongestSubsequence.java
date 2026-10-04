class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        // not consecutive 1's and zero 
        // longest Alternet in the group

        // start from 0 then search for next 1 
        // start from 1 then next 0 

        boolean zero = true ;
        List<String> ls = new ArrayList<>();
        int n = words.length;
        for(int i = 0 ; i < n ; i++){
            if( zero && groups[i] == 0){
                ls.add(words[i]);
                zero = false;
            } else 
            if( !zero && groups[i] == 1){
                ls.add(words[i]);
                zero = true;
            }
        }

        List<String> ls2 = new ArrayList<>();
        zero = false ;
        // List<String> ls = new ArrayList<>();
        // int n = words.length;
        for(int i = 0 ; i < n ; i++){
            if( zero && groups[i] == 0){
                ls2.add(words[i]);
                zero = false;
            }else 
            if( !zero && groups[i] == 1){
                ls2.add(words[i]);
                zero = true;
            }
        }

        
        return ls2.size() > ls.size() ?  ls2 : ls ;


    }
}
