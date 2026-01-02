import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class word_pattern {
    class Solution {
        public boolean wordPattern(String s, String t) {
            HashMap<Character, String> map = new HashMap<>();
            HashMap<String, Character> map2 = new HashMap<>();

            List<String> m = new ArrayList<>(); // spliting the String
            String substr = "";

            for (int i = 0; i < t.length(); i++) {
                if (t.charAt(i) == ' ') {
                    m.add(substr);
                    substr = "";
                } else {
                    substr += String.valueOf(t.charAt(i));
                }
            }

            m.add(substr); // last element

            if (s.length() != m.size())
                return false;

            for (int i = 0; i < s.length(); i++) {
                // character to word mapping
                char key = s.charAt(i);
                String value = m.get(i);
                if (map.containsKey(key) && !(map.get(key).equals(value))) {
                    return false;
                } else {
                    map.put(key, value);
                }

                // Word to character mapping
                char values = s.charAt(i);
                String keys = m.get(i);

                if (map2.containsKey(keys) && !(map2.get(keys).equals(values))) {
                    return false;
                } else {
                    map2.put(keys, values);
                }
            }
            return true;
        }
    }
}
