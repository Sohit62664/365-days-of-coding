class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer> ans = new ArrayDeque<>();
        Queue<Integer> first = new ArrayDeque<>();
        
        int n = q.size();
        
        n = n/2;
        while(n--> 0){
            first.offer(q.poll());
        }
        
        while(!first.isEmpty()){
            ans.offer(first.poll());
            ans.offer(q.poll());
        }
        
        while(!ans.isEmpty()){
            q.offer(ans.poll());
        }
        
        
    }
}
