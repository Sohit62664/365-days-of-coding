class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuffer sb = new StringBuffer(s);
        int n = s.length();
        sb.reverse();
        String s1 = s;
        String s2 = sb.toString();
        

        int dp[][] = new int[n+1][n+1];

        for(int i= 1 ; i<= n ; i++ ){
            for(int j = 1 ; j<= n ; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i -1][j] , dp[i][j-1]);
                }
            }
        }

        int l= dp[n][n];
        
        char [] ch = new char[l];

        // int i = n ; 
        // int j = n ; 
        // int index = l-1;
        // while(i > 0 && j > 0){
        //     if(s1.charAt(i-1)==s2.charAt(j-1)){
        //         ch[index--] = s1.charAt(i-1);
        //         i--;
        //         j--;
        //     }else if(dp[i-1][j] > dp[i][j-1]){
        //         i--;
        //     }else{
        //         j--;
        //     }
        // }

        // String ans = new String(ch);


        // return ans.toString();

        return l;
    }
}
