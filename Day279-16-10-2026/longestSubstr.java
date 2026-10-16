class Solution {
    public int longestSubstr(String s, int k) {
        // code here
        // make a window which has maximuum length and have the maximum frequency of anyone character 
        //for each such window calculate the changes which must be lesser than equals to k
        
        
        int left =0 ;
        int freq [] = new int[26];
        int ans = 0;
        
        for(int right = 0; right< s.length() ; right++){
            freq[s.charAt(right) - 'A']++;
            
            int max = 0 ; 
            for(int i =0 ; i< 26 ; i++){
                max = Math.max(max , freq[i]);
            }
            
            // if invalid Window 
            while(right- left +1  - max > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            
            ans = Math.max(ans , right-left+1 );
            
        }
        
        return ans ;
    }
}
