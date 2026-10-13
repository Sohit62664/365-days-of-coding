class Solution {
    public int numberOfSubarrays(int[] arr, int target) {
        // code here
        HashMap <Integer,Integer> map = new HashMap<>();
        int count =0 ;
        map.put(0 , 1 );
        int sum =0 ;
        for(int i =0 ; i< arr.length ; i++){
            sum += arr[i];
            
            int key = sum - target;
            if(map.containsKey(key)){
                count+= map.get(key);
            }
            
            map.put(sum , map.getOrDefault(sum , 0 ) +1);
            
            
        }
        
        return count;
    }
}
