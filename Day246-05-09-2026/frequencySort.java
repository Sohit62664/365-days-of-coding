class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        ArrayList<Character> ls = new ArrayList<>();
        for (char key : map.keySet()) {

            ls.add(key);
        }

        ls.sort((a, b) -> Integer.compare(map.get(b) , map.get(a)));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ls.size(); i++) {
            char ch = ls.get(i);
            int freq = map.get(ch);
            while (freq > 0) {
                sb.append(ch);
                freq--;
            }
        }

        return sb.toString();
    }
}
