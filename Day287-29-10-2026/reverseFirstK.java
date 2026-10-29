class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        
        
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        
        
        if(n < k) return q;
        
        while(k-->0){
            st.push(q.poll());
            n--;
        }
        
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        
        while(n-- > 0){
            q.offer(q.poll());
        }
        
        
        return q;
    }
}
