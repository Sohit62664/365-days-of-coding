import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class find_and_replace_element {
    class Solution {
        public List<String> findAndReplacePattern(String[] words, String pattern) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < words.length; i++) {
                if (mapping(words[i], pattern))
                    list.add(words[i]);
            }
            return list;
        }

        // logic : Check for one- onr on to mapping if mapping then add list otherwice
        // no

        public boolean mapping(String s, String t) {

            if (s.length() != t.length())
                return false;

            HashMap<Character, Character> map1 = new HashMap<>();
            HashMap<Character, Character> map2 = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char key = s.charAt(i);
                char value = t.charAt(i);

                if (map1.containsKey(key) && map1.get(key) != value) {
                    return false;
                } else {
                    map1.put(key, value);
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
