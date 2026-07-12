class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : set){
            pq.offer(num);
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();


        //number , Rank 

        for(int i = 1 ; i<= set.size() ; i++){
            int smallest = pq.poll();
            map.put(smallest , i);
        }

        int [] ans = new int[arr.length];

        for(int i =0 ; i< arr.length ; i++){
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}
