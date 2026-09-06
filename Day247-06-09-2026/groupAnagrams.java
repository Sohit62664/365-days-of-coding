
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();

        for(String s : strs){
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);   //  <----------------------------can't use .toString() it will not convert into the key 

            if(map.containsKey(key)){
                map.get(key).add(s);
            }else{
                map.put(key , new ArrayList<>());
                map.get(key).add(s);
            }
        }

        return new ArrayList<>(map.values());
    }
}
