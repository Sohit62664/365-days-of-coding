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



// With comments and notes
class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        
        
        List<Integer> ans = new ArrayList<>();
        int left =0  ;
        // using queue to track the index of the first negative number
        Queue<Integer> q = new ArrayDeque<>();
        
        for(int right= 0 ; right< arr.length ; right++){
            
            //expanding
            
            if(arr[right]< 0){
                q.offer(right);
            }
            
            if(right- left + 1 == k){ // valid window 
                
                // Added to the answer then adj Adjustment 
                
                ans.add(q.isEmpty() ? 0 : arr[q.peek()]);
                
                if(!q.isEmpty() && right- k +1 == q.peek()){
                    q.poll();
                }
                left++;
                
            }
        }
        
        return ans ;
    }
}


// follow the order


// Expand — add the new element to the window.



// Process — when the window size becomes k, calculate the answer.



// Shrink — remove the element leaving the window and move left. 
