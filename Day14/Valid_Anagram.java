package Day14;

import java.util.HashMap;

public class Valid_Anagram {

    // class Solution {
    // public boolean isAnagram(String s, String t) {
    // HashMap<Integer, Character> map = new HashMap<>();

    // if(s.length()!= t.length()) return false;

    // for(int i =0 ; i< s.length(); i++){
    // map.put(i , s.charAt(i));
    // }

    // for(Map.Entry <Integer, Character> entry : map.entrySet()){
    // if (!map.containsValue(entry.getValue())){
    // return false;
    // }else{
    // map.remove(entry.getKey());
    // }
    // }
    // HashMap< Character,Integer> m = new HashMap<>();

    // for(int i =0 ; i< s.length(); i++){
    // m.put( s.charAt(i), i);
    // }

    // // for(char c : t.toCharArray()){
    // // if (!map.containsValue(c)){
    // // return false;
    // // }else{
    // // map.remove(m.get(c));
    // // m.remove(c);
    // // }
    // // }

    // return true;
    // }
    // }

    class Solution {
        public boolean isAnagram(String s, String t) {

            if (s.length() != t.length())
                return false;

            HashMap<Character, Integer> map = new HashMap<>();

            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for (char c : t.toCharArray()) {
                if (!map.containsKey(c))
                    return false;

                map.put(c, map.get(c) - 1);

                if (map.get(c) == 0)
                    map.remove(c);
            }
            return map.isEmpty();

        }
    }

}