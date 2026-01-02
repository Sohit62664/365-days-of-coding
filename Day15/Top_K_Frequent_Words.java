import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Top_K_Frequent_Words {
    // class Solution {

    // class Pair {
    // String word;
    // int freq;

    // Pair(String word, int freq) {
    // this.word = word;
    // this.freq = freq;
    // }
    // }

    // public List<String> topKFrequent(String[] words, int k) {
    // List<String> result = new ArrayList<>();
    // HashMap<String , Integer> map = new HashMap<>();
    // for(String s : words){
    // map.put(s, map.getOrDefault(s, 0)+1);

    // }

    // List<Pair> bucket = new ArrayList<>();

    // for(int i =0 ; i< words.length ; i++){
    // // bucket.add({words[i], map.get(words[i])});

    // bucket.add(new Pair(words[i], map.get(words[i])));
    // }

    // bucket.sort((a, b) -> a.freq - b.freq);

    // int j = words.length-1;
    // while(k!=0){
    // if(bucket.get(j).word==bucket.get(j-1).word){
    // continue;
    // }
    // result.add(bucket.get(j).word);
    // j--;
    // k--;
    // }

    // return result;
    // }
    // }

    // class Solution {

    // class Pair {
    // String word;
    // int freq;

    // Pair(String word, int freq) {
    // this.word = word;
    // this.freq = freq;
    // }
    // }

    // public List<String> topKFrequent(String[] words, int k) {
    // List<String> result = new ArrayList<>();
    // HashMap<String, Integer> map = new HashMap<>();

    // for (String s : words) {
    // map.put(s, map.getOrDefault(s, 0) + 1);
    // }

    // List<Pair> bucket = new ArrayList<>();

    // for (int i = 0; i < words.length; i++) {
    // bucket.add(new Pair(words[i], map.get(words[i])));
    // }

    // bucket.sort((a, b) -> a.freq - b.freq);

    // int j = words.length - 1;

    // while (k != 0 && j > 0) {
    // if (bucket.get(j).word.equals(bucket.get(j - 1).word)) {
    // j--;
    // continue;
    // }
    // result.add(bucket.get(j).word);
    // j--;
    // k--;
    // }
    // Collections.sort(result);
    // return result;
    // }
    // }

    class Solution {

        class Pair {
            String word;
            int freq;

            Pair(String word, int freq) {
                this.word = word;
                this.freq = freq;
            }
        }

        public List<String> topKFrequent(String[] words, int k) {

            HashMap<String, Integer> map = new HashMap<>();
            for (String s : words) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }

            List<Pair> bucket = new ArrayList<>();
            for (String key : map.keySet()) {
                bucket.add(new Pair(key, map.get(key)));
            }

            bucket.sort((a, b) -> {
                if (a.freq != b.freq)
                    return b.freq - a.freq;
                return a.word.compareTo(b.word);
            });

            List<String> result = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                result.add(bucket.get(i).word);
            }

            return result;
        }
    }

}
