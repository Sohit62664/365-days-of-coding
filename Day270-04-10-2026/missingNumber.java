class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int max = arr[0];
        HashSet<Integer> set = new HashSet<>();
        
        for(int x  : arr ){
            max = Math.max(x, max);
            set.add(x);
        }
        if(max <=0) max = 1 ; 
        for(int i=1 ; i <= max+1 ; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        
        return max+1;
        
        
    }
}
