class Solution {
    public int passwordStrength(String password) {
        boolean lower = false;
        boolean upper = false;
        boolean number = false;
        boolean special = false;


        HashSet<Character> set = new HashSet<>();

        for(int i =0 ; i< password.length() ; i++){
            char ch= password.charAt(i);
            set.add(ch);
        }

        int str = 0 ; 
        for(char ch : set){
            if(ch>= 'a' && ch <= 'z'){
                str++;
            }else if(ch>= 'A' && ch <= 'Z'){
                str+=2 ;
            }else if(ch>= '0' && ch <= '9'){
                str+=3 ;
            }else {
                str+=5;
            }
        }


        return str;
    }
}
