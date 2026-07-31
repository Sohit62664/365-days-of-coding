class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> map = new HashMap<>();

        int left = 0 ; 
        int max_len = 0 ;

        for(int right = 0 ; right< s.length() ; right++){
            char ch = s.charAt(right);
            while(map.containsKey(ch)){
                char left_char = s.charAt(left);
                map.put( left_char, map.get(left_char)-1);
                if(map.get(left_char)== 0) map.remove(left_char);
                left++;
            }


            map.put(ch , map.getOrDefault(ch , 0)+1);
            max_len = Math.max(max_len , right- left+ 1);
        }
        return max_len;
    }
}
