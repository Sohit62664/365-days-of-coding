class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (map.containsKey(ch)) {
                char lch = s.charAt(left);
                map.put(lch, map.get(lch) - 1);
                if (map.get(lch) == 0) {
                    map.remove(lch);
                }
                left++;
            }
            max = Math.max(right - left +1 , max);

            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        return max;

    }
}
