class Solution {
    static ArrayList<Integer> kthLargest(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i = 0; i < arr.length; i++){
            
            if(minHeap.size() < k){
                minHeap.add(arr[i]);
                
                if(minHeap.size() < k){
                    ans.add(-1);
                } else {
                    ans.add(minHeap.peek());
                }
                
            } else {
                if(arr[i] > minHeap.peek()){
                    minHeap.poll();
                    minHeap.add(arr[i]);
                }
                ans.add(minHeap.peek());
            }
        }
        
        return ans;
    }
}
