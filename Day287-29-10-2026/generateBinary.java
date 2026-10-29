class Solution {
    public ArrayList<String> generateBinary(int n) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        
        Queue<String> q= new ArrayDeque();
        q.offer("1");
        while(n-- > 0){
            String s1 = q.poll();
            
            ans.add(s1);
            
            String s2= s1 ;
            
            if(q.size() < n ){
                q.offer(s1+"0"); // because String is Imputable 
                q.offer(s2 + "1");
            }
            
        }
        
        return ans ;
    }
}
