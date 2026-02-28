class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0 ; i< s.length() ; i++){
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        // int i = 0 ;
        // int j = ans.length()-1;

        // while(i<j){
        //     // swap(ans.charAt(i), ans.charAt(j))
        //     char temp = ans.charAt(i);
        //     ans.setCharAt(i, charAt(j));
        //     ans.setCharAt(j, temp);
           
        //     i++;
        //     j--;
        // }
        return ans.reverse().toString();
    }
}