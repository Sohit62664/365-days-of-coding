class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        
        for(int i =0 ; i< arr.length ; i++){
            String s = arr[i];
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String c = new String(ch);
            if(!map.containsKey(c)){
                map.put(c , new ArrayList<>());
            }
            map.get(c).add(s);
        }
        
        for (ArrayList<String> list : map.values()) {
            ans.add(list);
        }
        
        return ans;
    }
}
