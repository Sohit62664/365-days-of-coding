class Solution {
    public int minOps(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        int st = 0 ;
        int end = arr.length-1 ;
        int moves = 0 ;
        
        while(end>st){
            arr[end]+=moves;
            moves+= arr[end]- arr[st];
            arr[st]= arr[end];
            end--;
        }
        
        
        return moves;
    }
}
