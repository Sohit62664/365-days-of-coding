class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0 ; i<arr.length ; i++){
            pq.offer(arr[i]);
        }
        
        
        for(int i = 0 ; i< k ; i++){
            int ans = pq.poll();
            
            if(i == k-1) return ans ;
        }
        
        
        return -1 ;
    }
}
