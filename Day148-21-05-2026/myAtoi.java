// myAtoi means a custom function that converts a string into an integer (ASCII to Integer)

class Solution {
    public int myAtoi(String s) {
        // code here
        int n=s.length();
        if(n==0) return 0;
        
        int i = 0;
        //skip spaces
        while(i<n && s.charAt(i) == ' '){
            i++;
        }
        
        int sign = 1;
        // checking for sign
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }
        
        //removing theleading zeros 
        while(i<n && s.charAt(i)=='0'){
            i++;
        }
        
        long num = 0;
        
        while(i<n && Character.isDigit(s.charAt(i))){
            num = num * 10 + (s.charAt(i) - '0');
            
            if(sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            
            i++;
        }
        
        return (int) num * sign;
    }
}
