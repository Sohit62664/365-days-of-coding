class Solution {
    public List<String> powerSet(String s) {
        // Code here
        
        List<String> ans = new ArrayList<>();
        helper(s , "" , ans , 0);
        Collections.sort(ans);
        return ans;
        
    }
    
    void helper(String s , String ans , List<String> ls , int i){
        if(i== s.length()){
            ls.add(ans);
            return ;
        }
        
        // for(int j = i ; j< s.length() ; j++){
            // String copy = new String(s);
            helper(s , ans , ls , i+1);
            ans+= s.charAt(i);
            helper(s , ans , ls , i+1);
            
        // }
    }
    
    
}
