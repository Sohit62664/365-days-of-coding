class Solution {
    public int countAllDistinct(int[] arr) {
        // code here
        
        HashSet <Integer> set = new HashSet<>();
        
        for(int x : arr){
            set.add(x);
        }
        
        int d = set.size();
        int count= 0 ;
        int n = arr.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int left =0 ;
        
        for(int right =0 ; right< arr.length; right++){
            // add to the window 
            int v = arr[right];
            
            map.put(v , map.getOrDefault(v , 0)+ 1);
            
            //Shrink the window While valid 
            while(map.size() == d){
                
                // update the answer
                count+= n- right;
                
                
                // Removing the last Element
                map.put(arr[left] , map.get(arr[left])-1);
                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }
                left++;
            }
        }
        
        return count;
    }
}
