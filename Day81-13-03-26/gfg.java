class Solution {
    public ArrayList<String> generateIp(String s) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        int n = s.length();
        
        if(n< 4 || n>12) return ans;
        
        for(int i = 1 ;i<=3 ; i++){
            for(int j = 1 ; j<= 3 ; j++){
                for(int k = 1 ; k<= 3 ; k++){
                    int l = n - (i+j+k);
                    if (l<1 || l > 3) continue;
                    String A = s.substring(0 , i);
                    String B = s.substring(i , i+j);
                    String C = s.substring(i+j , i+j+k);
                    String D = s.substring(i+j+k , i+j+k+l);
                    
                    if(valid(A) && valid(B) && valid(C)&& valid(D)){
                        ans.add(A+"."+B+"."+C+"."+D);
                    }
                }
            }
        }
        return ans;
    }
    boolean valid(String s){
        if(s.length()>1 && s.charAt(0) == '0'){
            return false;
        }
        int num = Integer.parseInt(s);
        if(num<=255 && num>=0){
            return true;
        }
        return false;
    }
}
