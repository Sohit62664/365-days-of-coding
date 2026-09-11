class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        
        int max = arr[arr.length-1];
        for(int i = arr.length-1 ; i>=0 ; i--){
            max = Math.max(max , arr[i]);
            
            if(max== arr[i]){
                ans.add(max);
            }
        }
        
        Collections.reverse(ans);
        return ans ;
        
        
    }
}
