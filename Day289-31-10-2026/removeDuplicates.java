

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty() && ch == st.peek()) {
                st.pop();
            } else {
                st.push(ch);
                
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }

}



// Using String Builder 

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
       
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(sb.length()>0 && ch== sb.charAt(sb.length()-1)){
                sb.deleteCharAt(sb.length()-1) ;
            }else{
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }

}
