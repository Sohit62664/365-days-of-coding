class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();


        int l = t.length();


        // s--> t
        for(int i =0 ; i< l ;  i++){
            char ch = s.charAt(i);
            if(map1.containsKey(ch)){
                if(map1.get(ch) != t.charAt(i)){
                    return false;
                }
            }else{
                map1.put(ch , t.charAt(i));
            }

        }


        // t---> s
        for(int i =0 ; i< l ;  i++){
            char ch = t.charAt(i);
            if(map2.containsKey(ch)){
                if(map2.get(ch) != s.charAt(i)){
                    return false;
                }
            }else{
                map2.put(ch , s.charAt(i));
            }

        }



        return true ;
    }
}
