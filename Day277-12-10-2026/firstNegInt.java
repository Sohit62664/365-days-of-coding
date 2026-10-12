class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        
        int n = arr.length - k + 1;
        
        int ans[] = new int[n];
        int left =0  ;
        Queue<Integer> q = new ArrayDeque<>();
        
        for(int right= 0 ; right< arr.length ; right++){
            if(arr[right]< 0){
                q.offer(right);
            }
            
            if(right- left + 1 == k){
                ans[left++] = q.isEmpty() ? 0 : arr[q.peek()]; 
                
                if(!q.isEmpty() && right- k +1 == q.peek()){
                    q.poll();
                }
            }
        }
        List<Integer> ls = new ArrayList<>();
        for(int i : ans){
            ls.add(i);
        }
        
        return ls ;
    }
}
