class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 1;
        // for(int i = 0 ; i< s.length() ; i++){
        //     char ch = s.charAt(i);
        //     if(set.contains(ch)){
        //         set.clear();
        //     }
        // set.add(ch);
        // max = Math.max(set.size(), max);
        // }
        // if(s.isEmpty()){
        //     return 0;
        // }else {
        //     return max;
        // }

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (set.contains(ch)) {
                    max = Math.max(set.size(), max);
                    set.clear();
                    break;
                }
                set.add(ch);
            }
        }
        if (s.isEmpty()) {
            return 0;
        } else {
            return max;
        }
    }
}
