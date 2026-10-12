class Solution {
    public int findSubString(String s) {
        // code here
        HashSet <Character> set = new HashSet<>();
        
        for(char c: s.toCharArray()){
            set.add(c);
        }
        int k= set.size();
        
        // int window [] = new int[26];
        int left =0;
        // have to use hashmap 
        int min = Integer.MAX_VALUE;
        
        HashMap<Character , Integer> map = new HashMap<>();
        for(int right =0 ; right< s.length() ; right++){
            // window[s.charAt(right) - 'a']++;
            map.put(s.charAt(right)  , map.getOrDefault(s.charAt(right) , 0)+1);
            
            
            
            while(map.size() >= k){
                // window[s.charAt(left) - 'a']--;
                
                char left_c = s.charAt(left) ;
                
                map.put(left_c , map.get(left_c)-1 );
                
                if(map.get(left_c)==0){
                    map.remove(left_c);
                }
                left++;
                min = Math.min(right- left + 1 , min);
            }
        }
        
        
        return min+1;
        
    }
}
