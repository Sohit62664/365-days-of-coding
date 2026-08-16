class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0 ;
        int left = 0 ;

        HashMap<Character , Integer> map = new HashMap<>();
        for(int right = 0 ; right < s.length() ; right++){
            char ch = s.charAt(right);

            while(map.containsKey(ch)){
                char chl = s.charAt(left);
                map.put(chl , map.getOrDefault(chl , 0)-1);
                if(map.get(chl) == 0){
                    map.remove(chl);
                }
                left++;
            }

            map.put(ch , map.getOrDefault(ch , 0)+ 1);

            max = Math.max(right-left + 1 , max);
        }

        return max ;
    }
}
