class Solution {
    public long maxTotal(int[] nums, String s) {
        int n = nums.length ;
        long ans = 0 ;
        int i =0 ;

        while(i< n){
            
            if(s.charAt(i)== '0'){
                i++;
                continue;
            }

            
            int st = i ;
            while(i<n &&s.charAt(i)=='1'){
                i++;
            }

            int end = i-1 ;

            int k = end - st+1;

            
            int left = Math.max(0 , st-1);

            PriorityQueue<Integer> q = new PriorityQueue<>();
            
            for(int j = left ; j<= end ; j++ ){
                q.offer(nums[j]);
                if(q.size()>k){
                    q.poll();
                }
            }

            while(!q.isEmpty()){
                ans+=q.poll();
            }
            
            
            
        }

        return ans;
        
    }
}
