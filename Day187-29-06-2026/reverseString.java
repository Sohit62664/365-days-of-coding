class Solution {
    public void reverseString(char[] s) {
        // Using Stack 
        Deque<Character> stack = new ArrayDeque<>(); //taken time 2ms 
        // Stack<Character> stack = new Stack<>(); //taken time 4ms 

        for(char ch : s){
            stack.push(ch);
        }

        int i= 0 ;
        while(!stack.isEmpty()){
            s[i]=stack.pop();
            i++;
        }
        return;

    }
}
