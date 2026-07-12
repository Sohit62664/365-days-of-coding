class Solution {
    public int maxAmount(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    
        for(int x : arr){
            pq.offer(x);
        }
        
        long  ans = 0 ; 
        int mod = 1_000_000_007;
        
        while(k-- > 0 && !pq.isEmpty()){
            int x = pq.poll();
            ans = (ans+x) % mod ;
            
            if(x>1 ){
                pq.offer(x-1);
            }
            
        }
        
        
        return (int)ans;
        
    }
}
