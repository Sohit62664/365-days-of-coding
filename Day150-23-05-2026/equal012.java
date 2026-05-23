// User function Template for Java

// Naive Approach 
class Solution {
    long equal012(String str) {
        // code here
        
        long ct = 0;
        int n= str.length();
        for(int i=0 ; i< n ; i++){
            for(int j= i+1 ; j < n ; j++){
                
                String sub  =  str.substring(i , j+1);
                
                int c0 = 0 , c1=0 , c2 =0;
                for(int k = 0 ; k< sub.length() ; k++){
                    if(sub.charAt(k)=='0') c0++;
                    if(sub.charAt(k)=='1') c1++;
                    if(sub.charAt(k)=='2') c2++;
                }
                
                if(c1==c2 && c0==c1) ct++;
            }
        }
        
        return ct;
    }
}
