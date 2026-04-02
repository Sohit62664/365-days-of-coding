class Solution {
    public ArrayList<ArrayList<String>> palinParts(String s) {
        // code here
        ArrayList<ArrayList<String>>res = new ArrayList<>();
        ArrayList<String> current = new ArrayList<>();
        backtracking(0 , s , current , res);
        
        return res;
    }
    
    public boolean isPalindrome(String s){
        int i = 0 ;
        int j =s.length()-1;
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        }
        
        return true;
    }
    
    public void backtracking(int idx , String s , List<String> current , List<ArrayList<String>> res ){
        if(idx == s.length()){
            res.add(new ArrayList<>(current));
            return;
        }
        
        StringBuilder temp = new StringBuilder();
        
        for(int i = idx  ; i<s.length() ; i++){
            temp.append(s.charAt(i));
            String sub= temp.toString();
            if(isPalindrome(sub)){
                current.add(sub);
                backtracking(i+1 , s , current , res);
                current.remove(current.size() - 1); 
            }
            
        }
    }
    
}
