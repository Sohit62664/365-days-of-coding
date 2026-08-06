class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int left = 0 ;
        int max = 0 ;
        
        for(int right =0 ; right < s.length() ; right ++){
            char ch = s.charAt(right);
            while(map.containsKey(ch)){
                char left_ch = s.charAt(left);
                
                map.put(left_ch , map.getOrDefault(left_ch , 0)-1);
                if(map.get(left_ch)== 0){
                    map.remove(left_ch);
                }
                
                left++;
            }
            
            map.put(ch , map.getOrDefault(ch, 0)+1);
            
            max = Math.max(max  , right-left+1);
        }
        
        return max;
        
    }
}
