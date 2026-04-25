class Solution {
    public ArrayList<Integer> reducePairs(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 1 ;
        int n = arr.length;
        while(i<n){
            int a = arr[i-1];
            int b= arr[i];
            if((a<0 && b>0) || (a>0 && b<0) ){
                if (Math.abs(a)!= Math.abs(b)){
                    int c = Math.max(a,b);
                    ans.add(c);
                }
            }
            i++;
            
        }
        return ans;
    }
}
