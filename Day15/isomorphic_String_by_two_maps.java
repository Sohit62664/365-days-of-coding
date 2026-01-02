import java.util.HashMap;

public class isomorphic_String_by_two_maps {

    class Solution {
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character> map = new HashMap<>();
            HashMap<Character, Character> map2 = new HashMap<>();
            if (s.length() != t.length())
                return false;

            for (int i = 0; i < s.length(); i++) {
                char key = s.charAt(i);
                char value = t.charAt(i);
                if (map.containsKey(key) && map.get(key) != value) {
                    return false;
                } else {
                    map.put(key, value);
                }

                char temp = key;
                key = value;
                value = temp;

                if (map2.containsKey(key) && map2.get(key) != value) {
                    return false;
                } else {
                    map2.put(key, value);
                }
            }
            return true;
        }
    }

}
