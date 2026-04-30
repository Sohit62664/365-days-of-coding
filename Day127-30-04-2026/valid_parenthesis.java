class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')' , '(');
        map.put('}' , '{');
        map.put(']' , '[');

        Deque<Character> stack= new ArrayDeque<>();
        for(int i = 0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch =='{' || ch == '['){
                stack.push(ch);
            }else{
                if(stack.peek()== map.get(ch)){
                    stack.pop();
                    
                }else{
                    return false ;
                }
            }
        }
        return stack.isEmpty();
    }
}
