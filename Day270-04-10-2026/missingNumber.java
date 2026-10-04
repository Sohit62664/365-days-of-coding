// Approach O(N) , O(N)

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




// Approach --->> O(NlogN) , O(1) 
class Solution {
    public int missingNumber(int[] arr) {
        // code here
        Arrays.sort(arr)  ;
        int n= arr.length ;
        int max = arr[n-1];
        
        if(max< 0) return 1 ;
        
        int i =0 ; 
        while(i< arr.length && arr[i]<=0){
            i++;
        }
        
        
        
        for(int j = 1 ; j<= max+1 && i < arr.length ; j++){
            if(arr[i] != j){
                return j;
            }
            int val = arr[i];
            
            while(i < arr.length && arr[i] == val )
            i++;
        }
        
        return max+1 ;
    }
}


