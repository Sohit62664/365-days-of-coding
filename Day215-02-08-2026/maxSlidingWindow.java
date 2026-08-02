class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int idx = 0;
        int[] ans = new int[n - k + 1];
        ArrayDeque<Integer> q = new ArrayDeque<>();

        // int id = 0 ;
        // for(int i =0 ; i< k ; i++){
        //     if(nums[id]<nums[i]){
        //         id = i ;
        //     }
        // }
        for (int i = 0; i < k; i++) {
            while (!q.isEmpty() && nums[i] >= nums[q.peekLast()]) {
                q.removeLast();
            }
            q.offerLast(i);
        }

       
        ans[idx] = nums[q.peekFirst()];
        idx++;

        for (int i = k; i < n; i++) {

            // Checking th Range of the max element is it lies in the Range
            while (!q.isEmpty() && q.peekFirst() == i - k) {
                q.removeFirst();
            }

            while (!q.isEmpty() && nums[i] >= nums[q.peekLast()]) {
                q.removeLast();
            }

            q.offerLast(i);
            ans[idx++] = nums[q.peekFirst()];

        }

        return ans;

    }
}
