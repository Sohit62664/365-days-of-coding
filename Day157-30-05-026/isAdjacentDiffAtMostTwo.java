class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {

        for(int i =  1 ; i < s.length() ; i++){
            char a = s.charAt(i-1);
            char b = s.charAt(i);


            int diff = a-b;

            if(Math.abs(diff)>2){
                return false;
            }
            
        }


        
        return true;
    }
}
