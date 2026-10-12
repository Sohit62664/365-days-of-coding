class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap <>();
        ArrayList<Integer> ans = new ArrayList<>();
        int left =0 ;
        for(int r =0 ; r< arr.length ; r++){
            map.put(arr[r] , map.getOrDefault(arr[r] , 0)+1 );
            //
            if(r-left + 1 > k){
                int l_v = arr[left];
                map.put(l_v , map.get(l_v)-1);
                if(map.get(l_v)== 0){
                    map.remove(l_v);
                }
                left++;
            }
            if(r-left+1 == k){
                ans.add(map.size());
            }
            
            //update the answer
            
            
        }
        return ans;
    }
}
