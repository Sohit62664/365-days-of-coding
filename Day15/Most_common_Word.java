public class Most_common_Word {
    // class Solution {
//     public String mostCommonWord(String paragraph, String[] banned) {
//         String result;
//         HashMap<String , Integer> map = new HashMap<>();

//         for(int i =0 ; i<paragraph.length(); i++){
//             String temp ="";

//             while(i<paragraph.length()&& paragraph.charAt(i)==" "){
//                 temp+=paragraph.charAt(i);
//             }
//             map.put(temp, map.getOrDefault(temp, 0)+1);
//         }




//         return result.toLowerCase();
//     }
// }

import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase().replaceAll("[^a-z ]", " ");

        String[] words = paragraph.split("\\s+");

        Set<String> bannedSet = new HashSet<>();
        for (String b : banned) {
            bannedSet.add(b);
        }

        
        HashMap<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            if (word.length() == 0 || bannedSet.contains(word))
                continue;
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        String ans = "";
        int maxFreq = 0;

        for (String key : freqMap.keySet()) {
            if (freqMap.get(key) > maxFreq) {
                maxFreq = freqMap.get(key);
                ans = key;
            }
        }

        return ans;
    }
}

}
