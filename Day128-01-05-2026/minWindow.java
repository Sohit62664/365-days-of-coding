// class Solution {
//     public String minWindow(String s, String t) {
      
//         // Frequency Map fot t
//         HashMap<Character, Integer> map = new HashMap<>();

//         for(int i = 0 ;i < t.length() ; i++){
//             map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
//         }

//         int i = 0 ;
//         int j = 0;
//         // Frequency Map fot s 
//         HashMap<Character, Integer> window = new HashMap<>();
//         int li = 0, lj = 0;
//         int min= Integer.MAX_VALUE;
//         while(j< s.length()){
//             char ch = s.charAt(j);
//             window.put(ch , window.getOrDefault(ch , 0)+1);
//             if(covered(map , window)){
//                 int new_min = j-i ;
//                 if(new_min<min){
//                 li= i;
//                 lj = j ;

//                 }
//                 i++;
//             }else{
//                 j++;
//             }
//         }
//         return s.substring(li , lj+1);
        
//     }

//     boolean covered(HashMap<Character, Integer> map, HashMap<Character, Integer> window) {
//         for (Character key : map.keySet()) {
//             if (window.getOrDefault(key, 0) < map.get(key)) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }



class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        int i = 0;
        int j = 0;
        int formed = 0;
        int required = map.size();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (j < s.length()) {
            char ch = s.charAt(j);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (map.containsKey(ch) && window.get(ch).intValue() == map.get(ch).intValue()) {
                formed++;
            }

            while (i <= j && formed == required) {
                if (j - i + 1 < minLen) {
                    minLen = j - i + 1;
                    start = i;
                }

                char left = s.charAt(i);
                window.put(left, window.get(left) - 1);

                if (map.containsKey(left) && window.get(left) < map.get(left)) {
                    formed--;
                }

                i++;
            }

            j++;
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(start, start + minLen);
        }
    }
}
