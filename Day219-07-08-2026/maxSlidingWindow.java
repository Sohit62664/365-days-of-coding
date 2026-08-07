class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans [] = new int [n-k+1];
        ArrayDeque<Integer> q = new ArrayDeque <>();
        
        //first window 
        for(int i =0 ; i< k ; i++){
            while(!q.isEmpty() && nums[i] >= nums[q.peekLast()]){
                q.removeLast();
            }
            q.offerLast(i);
        }

        int idx = 0 ;
        ans[idx++]= nums[q.peekFirst()];

        for(int i = k ; i< n ; i++){
            while(!q.isEmpty() && q.peekFirst() == i-k ){
                q.removeFirst(); // ckecking for that index is it in range if it's not then remove -> in short aabribiation by this we are checking is it the last element which is not present in that window 

            }

            while(!q.isEmpty() && nums[i]>= nums[q.peekLast()]){
                q.removeLast();

            }

            q.offerLast(i);
            ans[idx++]= nums[q.peekFirst()];
        }

        return ans ;

    }
}
