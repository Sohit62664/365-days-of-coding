class Solution {
    int missingNum(int arr[]) {
        // code here
        // total numbers = n
        // Brute Force
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr ){
            set.add(num);
            
        }
        int n = arr.length;
        
        for(int i = 1 ; i<= n+1 ; i++){
            if(!set.contains(i)){
                return i ;
            }
        }
        
        return -1 ;
    }
}
