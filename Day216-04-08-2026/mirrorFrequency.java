class Solution {
    public int mirrorFrequency(String s) {
        // Implimentation 
        HashMap<Character , Character> mirrors = new HashMap<>();


        //numeric values
        String digit = "0123456789";
        for(int i =0 ; i< 10 ; i++){
            char c = digit.charAt(i);
            char m = digit.charAt(9-i);
            mirrors.put(c , m);
        }

        String letters = "abcdefghijklmnopqrstuvwxyz";
        
        for(int i =0 ; i  <= 25 ; i++ ){
            char c = letters.charAt(i);
            char m = letters.charAt(25-i);
            mirrors.put(c , m);            
        }

        HashMap<Character , Integer> freq = new HashMap<>();
        
        for(char ch : s.toCharArray()){
            freq.put(ch , freq.getOrDefault(ch , 0) + 1);
        }

        HashSet<Character> set = new HashSet<>();

        int sum = 0 ;
        for(char ch : s.toCharArray()){
            if(!set.contains(ch)){
                set.add(mirrors.get(ch));
                set.add(ch);
                int c_f = freq.get(ch);
                int m_f = 0 ; 
                if(freq.containsKey(mirrors.get(ch))){
                    m_f = freq.get(mirrors.get(ch));
                }
                int res = (c_f-m_f)  ; 
                sum += Math.abs(res);
                
            }
        }
        return sum ;
        
        
        
    }
}
