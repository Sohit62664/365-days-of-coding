class Solution {
    public boolean isMatch(String p, String s) {
        int n = s.length();
        int m = p.length();

        return f(n-1 , m -1 , s , p);
    }

    boolean f(int i , int j ,String s , String p){
        if(i < 0){
            if(j<0) return true ;
            return false ;
        }
        

        // if my p is finished this mence nothing i can compaere so i need to check wether the remaining i in s is stars if they are that mence we scessfully matched so true else false 

        if(j < 0){
            for(int k = 0 ; k<= i ; k++){
                if(s.charAt(k)!= '*' ) return false;
            }
            return true ;
        }

        // recurrance 
        if(s.charAt(i) == p.charAt(j)){
            return f(i-1 , j-1 , s , p);
        }else if(s.charAt(i) == '?'){
            return f(i-1 , j-1 , s , p);
        }else if(s.charAt(i) == '*'){
            boolean nostar  = f(i -1, j , s , p);
            boolean star  = f(i , j-1 , s , p);


            return (nostar || star) ;
        }else{
            return false ;
        }
    }

}
