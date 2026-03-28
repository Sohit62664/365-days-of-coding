//Stack overflow runtime error 
// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        if(s = "" ) return "";
       StringBuilder sb = new StringBuilder();
        sb = remover(s , 1 ,sb.append(s.charAt(0)));
       String str = sb.toString();
       return str;
    }
    static StringBuilder remover(String s , int i , StringBuilder sb){
        if(i>=s.length()) return sb;
       
            char ch = s.charAt(i);
            if(ch == s.charAt(i - 1) ){    
                return remover(s , i+1 , sb);
            }else{
                return remover(s , i+1 , sb.append(ch));
            }       
       
    }    
}

//iteerative approach

// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        
        int i = 1 ;
        
        char pre = s.charAt(0);
        sb.append(pre);
        while(i< s.length()){
            if(s.charAt(i)!= pre){
                sb.append(s.charAt(i));
                pre=s.charAt(i);
            }
            i++;
        }
        
        String str = sb.toString();
        
        return str;
    }
}
