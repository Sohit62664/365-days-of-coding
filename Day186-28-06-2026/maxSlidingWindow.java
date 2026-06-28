class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int j =0 ;
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0 ; i< nums.length ; i++){
            if(!dq.isEmpty() && dq.peekFirst() <i-k+1){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);
            if(i>= k -1){
                ans.add(nums[dq.peekFirst()]);
            }
        }

        int [] result = new int[ans.size()];

        for(int i =0 ; i< ans.size() ; i++){
            result[i]= ans.get(i);
        }
        return result ;
    }
}
