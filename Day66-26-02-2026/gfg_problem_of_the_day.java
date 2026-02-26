class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        HashMap<Character, Character> map = new HashMap<>();
        
        for(int i = 0 ; i< s1.length() ; i++){
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            
            if(!map.containsKey(a)){
                map.put(a, b);
            }
            else{
                if(map.get(a)!=b){
                    return false;
                }
            }
        }
        HashMap<Character, Character> map2 = new HashMap<>();
        
        for(int i = 0 ; i< s1.length() ; i++){
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            
            if(!map2.containsKey(b)){
                map2.put(b,a);
            }
            else{
                if(map2.get(b)!=a){
                    return false;
                }
            }
        }
        return true;
    }
}
