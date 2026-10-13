class Solution {

    int search(String txt, String pat) {
        // code here
        int [] txt_f = new int[26];
        
        for(int i =0 ; i < txt.length() ; i++){
            txt_f[txt.charAt(i) -'a'] ++;
        }
        
        // System.out.println(Arrays.toString(txt_f));
        int count= 0 ; 
        int [] pat_w = new int[26];
        int left = 0 ; 
        for(int r =0 ; r< pat.length() ; r++){
            pat_w[pat.charAt(r) - 'a']++;
            while(r-left +1 > txt.length()){
                pat_w[pat.charAt(left) - 'a']--;
                left++;
            }
            
            if(r-left +1 == txt.length()){
                if (check(pat_w , txt_f)){
                    count++;
                }
                
            }
            
            
            
        }
            return  count ;
    }
    
    boolean check(int [] p , int [] w){
        for(int i =0 ; i < 26 ; i++){
            if(p[i]!= w[i]){
                return false;
            }
        }
        return true;
    }
    
    
}
