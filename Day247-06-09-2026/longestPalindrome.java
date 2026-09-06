class Solution {
    public String longestPalindrome(String s) {
        //Brute force 
        // from i to j check for palindrom return the substring with max 

        int max_len = 0 ; 
        String ans = "" ;

        for(int i =0 ; i< s.length() ; i++){
            for(int j = i+1 ; j < s.length() ; j++){
                if(isPalindrom(s.substring(i , j ))){
                    if(max_len<s.substring(i , j ).length() ){
                        max_len = s.substring(i , j ).length() ;
                        ans= s.substring(i , j );
                    }
                }
            }
        }

        return ans;



    }

    boolean isPalindrom(String s){
        int i=0 ;
        int j = s.length() - 1;

        while(i<=j){
            if(s.charAt(i)!= s.charAt(j)){
                return false ;
            }
            i++;
            j--;
        }

        return true;
    }
}




//Correct Bruteforce Approach 

class Solution {
    public String longestPalindrome(String s) {
        //Brute force 
        // from i to j check for palindrom return the substring with max 
        if (s.length() == 0)
            return "";
        int max_len = 1;
        String ans = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrom(sub)) {
                    if (max_len < sub.length()) {
                        max_len = sub.length();
                        ans = sub;
                    }
                }
            }
        }

        return ans;

    }

    boolean isPalindrom(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
