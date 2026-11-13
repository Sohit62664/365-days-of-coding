class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: nums){
            map.put(x , map.getOrDefault(x , 0) +1);
        }


        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b)-> {
                if(!(map.get(a).equals(map.get(b)))){
                    return Integer.compare(map.get(a), map.get(b));
                }else{
                    return Integer.compare(b , a);
                }
            }
        );

        for(int x : nums){
            pq.offer(x);
        }

        int ans[] = new int[nums.length];
        int i =0 ;
        while(!pq.isEmpty()){
            ans[i++]= pq.poll();
        }

        return ans;
    }
}
