class Solution {
    public int find(int[] arr) {
        // code here
        // Brute force approach 
        // Arrays.sort(arr); flop 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int max = 0 ;
        for(int i = 0 ; i< arr.length ; i++){
            max =  Math.max(max , arr[i]);
        }
        
        for(int v  = 0 ; v <= max ; v++){
            int x = v ;
            for(int i= 0 ; i < arr.length ; i++ ){
                    int y = arr[i];
                    x = x - (y - x);
                    if(x<0){
                        break ;
                    }
                    
                    if(i == (arr.length -1 ) && x>=0 ){
                        pq.offer(v);
                    }
                
            }
        }
        
        if(!pq.isEmpty()) return pq.poll();
        
        return -1;
        
    }
}
