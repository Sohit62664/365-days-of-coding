package Day13;

import java.util.HashMap;

public class Isomorphic_String {
    class Solution {
        // This Solution May Caause O(n^2) becauce Each ime we Are using the
        // containsValue(value) which has the time complexity of O(n) .
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character> map = new HashMap<>();
            if (s.length() != t.length())
                return false;

            for (int i = 0; i < s.length(); i++) {
                char key = s.charAt(i);
                char value = t.charAt(i);
                if (map.containsKey(key) && map.get(key) != value) {
                    return false;
                } else if (map.containsKey(key) && map.get(key) == value) {
                    continue;
                } else if (map.containsValue(value) && !(map.containsKey(key))) {
                    return false;
                } else {
                    map.put(key, value);
                }
            }
            return true;
        }
    }
}
