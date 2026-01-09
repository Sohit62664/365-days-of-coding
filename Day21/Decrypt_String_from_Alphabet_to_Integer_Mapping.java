import java.util.HashMap;

class Decrypt_String_from_Alphabet_to_Integer_Mapping {
    class Solution {
        public String freqAlphabets(String s) {
            // Createe A Hashmap Which stors the mapping
            // get the value by kew and Store in String Builder

            HashMap<String, String> map = new HashMap<>();

            for (int i = 1; i <= 26; i++) {
                if (i <= 9) {
                    String key = String.valueOf(i);
                    map.put(key, String.valueOf((char) (96 + i)));
                } else {
                    String key = String.valueOf(i) + "#";
                    map.put(key, String.valueOf((char) (96 + i)));
                }
            }
            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                    String key = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1)) + "#";
                    String value = map.get(key);
                    ans.append(value);
                    i += 2;
                } else {
                    String key = String.valueOf(s.charAt(i));
                    String value = map.get(key);
                    ans.append(value);
                }
            }
            return ans.toString();
        }
    }

}