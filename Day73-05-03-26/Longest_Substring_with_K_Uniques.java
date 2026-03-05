class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        
        int left = 0 ;
        int max = -1 ;
        
        for(int right = 0 ; right < s.length() ; right++){
            char r = s.charAt(right);
            map.put(r, map.getOrDefault(r,0)+1);
            if(map.size()==k){
                max= Math.max(right -left +1, max);
            }
            while(map.size()>k){
                char l = s.charAt(left);
                map.put(l, map.getOrDefault(l,0)-1);
                if(map.get(l)==0){
                    map.remove(l);
                }
                left++;
            }
        }
        
        return max;

    }
}
