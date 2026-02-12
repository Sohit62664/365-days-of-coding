class Solution {
    public int longestBalanced(String s) {
        // HashMap<Character , Integer> map = new HashMap<>();
        // int max_freq=0;
        // for(char ch: s.toCharArray()){
        //     map.put(ch , map.getOrDefault(ch , 0)+1);
        //     int i = map.get(ch);
        //     max_freq = Math.max(i , max_freq);
        // }
        // int total = 0;
        // for(char ch: map.keySet()){
        //     if(map.get(ch)==max_freq){
        //         total+=max_freq;
        //     }
        // }
        // return total;

        int n = s.length();
        int res = 0;
        int[] cnt = new int[26];
        for (int i = 0; i < n; i++) {
            Arrays.fill(cnt, 0);
            for (int j = i; j < n; j++) {
                boolean flag = true;
                int c = s.charAt(j) - 'a';
                cnt[c]++;
                for (int x : cnt) {
                    if (x > 0 && x != cnt[c]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    res = Math.max(res, j - i + 1);
                }

            }
        }
        return res;

    }
}