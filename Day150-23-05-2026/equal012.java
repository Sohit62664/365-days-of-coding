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



// optimize approach 


class Solution {
    public int equal012(String s) {
        // code here
        
        int n= s.length();
        
        HashMap<String , Integer> map = new HashMap<>();
        int z =0 , o= 0 , t= 0 ;
        
        
        int ans = 0;
        map.put("0#0",1);
        
        for(int i =0 ; i< n ; i++){
            
            char ch = s.charAt(i);
            
            if(ch == '0' ) z++;
            else if(ch=='1') o++;
            else t++;
            
            
            int d1 = z-o;
            int d2 = z-t;
            
            String key = d1+ "#" +d2;
            
            if(map.containsKey(key)){
                ans+=map.get(key);
            }
            
            map.put(key , map.getOrDefault(key , 0)+1);
        }
        
        return ans;
        
    }
}
