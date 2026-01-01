package Day14;

import java.util.HashMap;

public class ransom_Note {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character, Integer> m1 = new HashMap<>();
            HashMap<Character, Integer> m2 = new HashMap<>();

            for (char c : ransomNote.toCharArray()) {
                m1.put(c, m1.getOrDefault(c, 0) + 1);
            }

            for (char c : magazine.toCharArray()) {
                m2.put(c, m2.getOrDefault(c, 0) + 1);
            }

            for (char c : ransomNote.toCharArray()) {
                if (!m2.containsKey(c))
                    return false;
                if (m1.get(c) > m2.get(c))
                    return false;
            }

            return true;
        }
    }
}
