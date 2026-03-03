class Solution {
    public int totalElements(int[] arr) {
        // code here
        HashMap<Integer , Integer> map= new HashMap<>();
        int left = 0 ;
        int maxLen = 0 ;
        
        for(int right =0 ; right< arr.length ; right ++){
            map.put(arr[right] , map.getOrDefault(arr[right], 0)+1 );
            while(map.size()>2){
                
                map.put(arr[right] , map.getOrDefault(arr[right], 0)-1);
                if(map.get(arr[right]) == 0){
                    map.remove(arr[right]);
                }
                left++;
            }
            
            maxLen = Math.max(maxLen , right - left + 1);
        }
        return maxLen;
    }
}
