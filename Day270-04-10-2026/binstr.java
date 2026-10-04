class Solution {
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> ls = new ArrayList<>();
        return helper(n , 0 , ls , "");
        
        
    }
    
    ArrayList<String> helper(int n , int i , ArrayList<String> ls , String ans){
        if(ans.length() == n){
            ls.add(ans);
            return ls ;
        }
        
        helper(n , i+1 , ls , ans+"0");
        helper(n , i+1 , ls , ans+"1");
        
        return ls ;
    }
}
