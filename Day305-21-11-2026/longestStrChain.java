class Solution {
    public int longestStrChain(String[] words) {

        Arrays.sort(words , (a, b) -> a.length() - b.length());

        int n = words.length;

        int dp[ ] = new int[n] ;

        Arrays.fill(dp , 1 );
        int maxi = 1 ;
        for(int i =1 ; i< n ; i++){
            for(int pre = 0 ; pre < i ; pre++){
                if(compare(words[i] , words[pre]) && dp[i] < 1+ dp[pre]){
                    dp[i] = 1 + dp[pre];
                }
            }
            maxi = Math.max(maxi , dp[i]);
        }

        return maxi;
    }


    boolean compare(String s1 , String s2){
        int n= s1.length();
        int m = s2.length();
        if(n!= m+1) return false ;
        int i =0 ; 
        int j = 0 ; 
        while(i< n && j < m){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }

        return j == m;
    }
}
