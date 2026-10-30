class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        f(q);
        return;
    }
    
    void f(Queue<Integer> q){
        
        if(q.isEmpty()){
            return;
        }
        
        int t = q.poll();
        f(q);
        q.offer(t);
    }
    
    
}
